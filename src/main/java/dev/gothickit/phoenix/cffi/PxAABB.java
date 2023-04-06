package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxAABB extends Structure {
	public PxVec3 min, max;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("min", "max");
	}

	public static class ByValue extends PxAABB implements Structure.ByValue {
	}
}
