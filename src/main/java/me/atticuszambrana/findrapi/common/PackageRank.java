package me.atticuszambrana.findrapi.common;

public enum PackageRank {
	
	FREE("None"),
	PREMIUM("Premium"),
	STAFF("Staff");
	
	private String name;
	
	PackageRank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
