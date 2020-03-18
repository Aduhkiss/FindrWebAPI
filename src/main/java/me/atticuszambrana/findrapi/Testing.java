package me.atticuszambrana.findrapi;

import java.io.IOException;

import me.atticuszambrana.findrapi.model.MembershipStatus;
import me.atticuszambrana.findrapi.model.Profile;

public class Testing {
	public static void main(String[] args) {
		/*
		 * Testing class for making sure the API actually functions, will probably we removed in a later update
		 */
		
		FindrWeb api = new FindrWeb();
		
		try {
			
			Profile p = api.getProfile(1);
			MembershipStatus membership = api.getMembershipStatus(p);
			System.out.println(membership.getRankAsString());
			
		} catch (IOException e) {e.printStackTrace();}
	}
}
