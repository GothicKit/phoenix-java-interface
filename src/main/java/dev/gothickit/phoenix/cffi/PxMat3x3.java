package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxMat3x3 extends Structure {
	public float m00;
	public float m01;
	public float m02;
	public float m10;
	public float m11;
	public float m12;
	public float m20;
	public float m21;
	public float m22;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("m00", "m01", "m02", "m10", "m11", "m12", "m20", "m21", "m22");
	}

	public static class ByValue extends PxMat3x3 implements Structure.ByValue {
	}
}
