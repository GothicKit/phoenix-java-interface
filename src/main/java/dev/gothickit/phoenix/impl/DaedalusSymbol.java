package dev.gothickit.phoenix.impl;

import dev.gothickit.phoenix.Phoenix;
import dev.gothickit.phoenix.cffi.PxDaedalusSymbol;
import dev.gothickit.phoenix.cffi.PxDaedalusSymbolInfo;


public class DaedalusSymbol {
	private final PxDaedalusSymbol handle;
	private final PxDaedalusSymbolInfo info;

	public DaedalusSymbol(PxDaedalusSymbol handle) {
		this.handle = handle;

		this.info = new PxDaedalusSymbolInfo();
		Phoenix.API.pxScriptSymbolGetInfo(handle, this.info);
	}

	public String getName() {
		return this.info.getName();
	}

	public int getIntValue(int index) {
		return Phoenix.API.pxScriptSymbolGetInt(handle, index);
	}

	public float getFloatValue(int index) {
		return Phoenix.API.pxScriptSymbolGetFloat(handle, index);
	}

	public String getStringValue(int index) {
		return Phoenix.API.pxScriptSymbolGetString(handle, index);
	}

	public DaedalusSymbolType getReturnType() {
		return info.getReturnType();
	}

	public boolean isConst() {
		return info.isConst();
	}

	public boolean isMember() {
		return info.isMember();
	}

	public boolean isExternal() {
		return info.isExternal();
	}

	public boolean isMerged() {
		return info.isMerged();
	}

	public boolean isGenerated() {
		return info.isGenerated();
	}

	public boolean hasReturn() {
		return info.hasReturn();
	}

	public int getAddress() {
		return info.getAddress();
	}

	public int getParent() {
		return info.getParent();
	}

	public int getCount() {
		return info.getCount();
	}

	public int getIndex() {
		return info.getIndex();
	}

	public DaedalusSymbolType getType() {
		return this.info.getType();
	}
}
