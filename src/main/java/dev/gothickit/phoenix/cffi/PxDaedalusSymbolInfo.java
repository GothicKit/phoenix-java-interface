package dev.gothickit.phoenix.cffi;

import com.sun.jna.Structure;
import dev.gothickit.phoenix.impl.DaedalusSymbolType;

import java.util.List;

public class PxDaedalusSymbolInfo extends Structure {
	public String name;
	public boolean const_;
	public boolean member;
	public boolean external;
	public boolean merged;
	public boolean generated;
	public boolean return_;
	public int address;
	public int parent;
	public int count;
	public int index;
	public int type;
	public int return_type;

	public String getName() {
		return name;
	}

	public boolean isConst() {
		return const_;
	}

	public boolean isMember() {
		return member;
	}

	public boolean isExternal() {
		return external;
	}

	public boolean isMerged() {
		return merged;
	}

	public boolean isGenerated() {
		return generated;
	}

	public boolean hasReturn() {
		return return_;
	}

	public int getAddress() {
		return address;
	}

	public int getParent() {
		return parent;
	}

	public int getCount() {
		return count;
	}

	public int getIndex() {
		return index;
	}

	public DaedalusSymbolType getType() {
		return DaedalusSymbolType.of(type);
	}

	public DaedalusSymbolType getReturnType() {
		return DaedalusSymbolType.of(return_type);
	}

	@Override
	protected List<String> getFieldOrder() {
		return List.of(
				"name",
				"const_",
				"member",
				"external",
				"merged",
				"generated",
				"return_",
				"address",
				"parent",
				"count",
				"index",
				"type",
				"return_type"
		);
	}
}
