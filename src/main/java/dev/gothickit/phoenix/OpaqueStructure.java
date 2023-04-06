package dev.gothickit.phoenix;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.List;

public class OpaqueStructure extends Structure {
	public Pointer opaque;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("opaque");
	}
}
