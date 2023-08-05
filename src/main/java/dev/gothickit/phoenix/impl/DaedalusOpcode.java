package dev.gothickit.phoenix.impl;

import java.security.InvalidParameterException;

public enum DaedalusOpcode {
	ADD,
	SUB,
	MUL,
	DIV,
	MOD,
	BOR,
	BAND,
	LT,
	GT,
	LOR,
	LAND,
	LSL,
	LSR,
	LTE,
	EQ,
	NEQ,
	GTE,
	MOVL,
	ADDMOVL,
	SUBMOVL,
	MULMOVL,
	DIVMOVL,
	ABS,
	NEG,
	NOT,
	CMPL,
	NOP,
	RET,
	CALL,
	CALLEXT,
	PUSHL,
	PUSHR,
	PUSHRO,
	PUSHI,
	MOVS,
	MOVF,
	MOVP,
	MOVI,
	MOVIC,
	B,
	BZ;

	public static DaedalusOpcode of(int i) {
		return switch (i) {
			case 0 -> ADD;
			case 1 -> SUB;
			case 2 -> MUL;
			case 3 -> DIV;
			case 4 -> MOD;
			case 5 -> BOR;
			case 6 -> BAND;
			case 7 -> LT;
			case 8 -> GT;
			case 9 -> MOVL;
			case 11 -> LOR;
			case 12 -> LAND;
			case 13 -> LSL;
			case 14 -> LSR;
			case 15 -> LTE;
			case 16 -> EQ;
			case 17 -> NEQ;
			case 18 -> GTE;
			case 19 -> ADDMOVL;
			case 20 -> SUBMOVL;
			case 21 -> MULMOVL;
			case 22 -> DIVMOVL;
			case 30 -> ABS;
			case 31 -> NEG;
			case 32 -> NOT;
			case 33 -> CMPL;
			case 45 -> NOP;
			case 60 -> RET;
			case 61 -> CALL;
			case 62 -> CALLEXT;
			case 64 -> PUSHL;
			case 65 -> PUSHR;
			case 67 -> PUSHI;
			case 70 -> MOVS;
			case 72 -> MOVP;
			case 73 -> MOVF;
			case 74 -> MOVI;
			case 75 -> B;
			case 76 -> BZ;
			case 80 -> MOVIC;
			case 245 -> PUSHRO;
			default -> throw new InvalidParameterException();
		};
	}
}
