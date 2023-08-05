package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;
import dev.gothickit.phoenix.impl.DaedalusOpcode;

import java.util.List;

public class PxDaedalusInstruction extends Structure {
	public int code;
	public int p1;
	public byte p2;

	public DaedalusOpcode getCode() {
		return DaedalusOpcode.of(code);
	}

	public int getP1() {
		return p1;
	}

	public byte getP2() {
		return p2;
	}

	@Override
	protected List<String> getFieldOrder() {
		return List.of("code", "p1", "p2");
	}
}
