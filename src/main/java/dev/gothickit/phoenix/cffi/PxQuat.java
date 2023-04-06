package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxQuat extends Structure {
	public float x, y, z, w;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("x", "y", "z", "w");
	}
}
