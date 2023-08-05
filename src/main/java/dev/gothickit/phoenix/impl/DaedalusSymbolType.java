package dev.gothickit.phoenix.impl;

import org.jetbrains.annotations.NotNull;

import java.security.InvalidParameterException;

public enum DaedalusSymbolType {
	VOID("void"),
	FLOAT("float"),
	INT("int"),
	STRING("string"),
	CLASS("class"),
	FUNCTION("func"),
	PROTOTYPE("prototype"),
	INSTANCE("instance");

	private final String syntax;

	public String getSyntax() {
		return syntax;
	}

	DaedalusSymbolType(final @NotNull String syntax) {
		this.syntax = syntax;
	}

	public static DaedalusSymbolType of(int i) {
		return switch (i) {
			case 0 -> VOID;
			case 1 -> FLOAT;
			case 2 -> INT;
			case 3 -> STRING;
			case 4 -> CLASS;
			case 5 -> FUNCTION;
			case 6 -> PROTOTYPE;
			case 7 -> INSTANCE;
			default -> throw new InvalidParameterException();
		};
	}
}
