package dev.gothickit.phoenix;

import com.sun.jna.Native;

import java.lang.ref.Cleaner;

public class Phoenix {
	public static final Cleaner CLEANER = Cleaner.create();
	public static PhoenixNative API;

	public static PhoenixNative load(String lib) {
		return Native.load(lib, PhoenixNative.class);
	}

	public static PhoenixNative load() {
		if (API == null) {
			API = Native.load("phoenix-shared", PhoenixNative.class);
		}
		return API;
	}
}
