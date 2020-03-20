package me.atticuszambrana.findrapi;

import java.io.IOException;

public class Testing {
	public static void main(String[] args) throws IOException {
		/*
		 * Testing class for making sure the API actually functions, will probably we removed in a later update
		 */
		
		FindrWeb api = new FindrWeb();
		
		api.login("hello@google.com", "okay");
		
		System.out.println(api.getToken());
		
//		Profile p = api.getProfile(1);
//		
//		System.out.println(p.getUsername());
	}
}
