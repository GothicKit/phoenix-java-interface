package dev.gothickit.phoenix.impl;

import dev.gothickit.phoenix.Phoenix;
import dev.gothickit.phoenix.PhoenixException;
import dev.gothickit.phoenix.cffi.PxDaedalusInstruction;
import dev.gothickit.phoenix.cffi.PxDaedalusScript;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DaedalusScript {

	private final PxDaedalusScript handle;
	private List<DaedalusSymbol> symbols = null;

	public DaedalusScript(final @NotNull File path) throws FileNotFoundException, PhoenixException {
		final var buffer = Phoenix.API.pxBufferMmap(path.getAbsolutePath());
		if (buffer == null) throw new FileNotFoundException(path.getAbsolutePath());

		final var h = Phoenix.API.pxScriptLoad(buffer);
		Phoenix.API.pxBufferDestroy(buffer);

		if (h == null) {
			throw new PhoenixException("Failed to load PxDaedalusScript from " + path.getAbsolutePath());
		}

		Phoenix.CLEANER.register(this, () -> Phoenix.API.pxScriptDestroy(h));
		this.handle = h;
	}

	public @Nullable DaedalusSymbol findSymbolById(int id) {
		return new DaedalusSymbol(Phoenix.API.pxScriptGetSymbolById(handle, id));
	}

	public @Nullable DaedalusSymbol findSymbolByAddress(int address) {
		return new DaedalusSymbol(Phoenix.API.pxScriptGetSymbolByAddress(handle, address));
	}

	public List<DaedalusSymbol> getSymbols() {
		if (this.symbols == null) {
			this.symbols = new ArrayList<>();
			Phoenix.API.pxScriptEnumerateSymbols(handle, (script, symbol) -> {
				this.symbols.add(new DaedalusSymbol(symbol));
				return true;
			});
		}

		return this.symbols;
	}

	public CodeIterator getCode(int address) {
		return new CodeIterator(address);
	}

	public class CodeIterator implements Iterator<PxDaedalusInstruction> {
		private int ip;

		public CodeIterator(int initialOffset) {
			this.ip = initialOffset;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		public int getInstructionPointer() {
			return ip;
		}

		@Override
		public @NotNull PxDaedalusInstruction next() {
			PxDaedalusInstruction info = new PxDaedalusInstruction();
			this.ip += Phoenix.API.pxScriptGetInstruction(handle, ip, info);
			return info;
		}
	}
}
