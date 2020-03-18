package me.atticuszambrana.findrapi.model;

import me.atticuszambrana.findrapi.common.PackageRank;

public class MembershipStatus {
	private int user;
	private String packageRank;
	private PackageRank rankObject;
	
	public MembershipStatus(int user, String packageRank) {
		this.user = user;
		this.packageRank = packageRank;
		this.rankObject = PackageRank.valueOf(packageRank);
	}
	
	public int getUser() {
		return user;
	}
	
	public String getRankAsString() {
		return packageRank;
	}
	
	public PackageRank getRank() {
		return rankObject;
	}
}
