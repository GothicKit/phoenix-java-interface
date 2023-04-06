package dev.gothickit.phoenix;

import com.sun.jna.Native;

public class Phoenix {
	public static PhoenixNative API;

	public static PhoenixNative load(String lib) {
		return API = Native.load(lib, PhoenixNative.class);
	}

	public static PhoenixNative load() {
		return API = Native.load("phoenix-shared", PhoenixNative.class);
	}
}
