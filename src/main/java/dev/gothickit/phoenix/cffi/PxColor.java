package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxColor extends Structure {
	public byte r, g, b, a;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("r", "g", "b", "a");
	}
}
