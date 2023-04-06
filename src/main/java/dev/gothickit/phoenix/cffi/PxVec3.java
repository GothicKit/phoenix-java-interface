package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxVec3 extends Structure {
	public float x, y, z;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("x", "y", "z");
	}

	public static class ByValue extends PxVec3 implements Structure.ByValue {
	}
}
