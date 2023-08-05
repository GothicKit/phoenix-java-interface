package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;

import java.util.List;

public class PxMat4x4 extends Structure {
	public float m00;
	public float m01;
	public float m02;
	public float m03;
	public float m10;
	public float m11;
	public float m12;
	public float m13;
	public float m20;
	public float m21;
	public float m22;
	public float m23;
	public float m30;
	public float m31;
	public float m32;
	public float m33;

	@Override
	protected List<String> getFieldOrder() {
		return List.of("m00", "m01", "m02", "m03", "m10", "m11", "m12", "m13", "m20", "m21", "m22", "m23", "m30", "m31",
				"m32", "m33");
	}

	public static class ByValue extends PxMat4x4 implements Structure.ByValue {
	}
}
