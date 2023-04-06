package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxVec2 extends Structure {
	public float x, y;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("x", "y");
	}

	public static class ByValue extends PxVec2 implements Structure.ByValue {
	}
}
