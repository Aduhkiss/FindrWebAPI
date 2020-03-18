package me.atticuszambrana.findrapi;

import java.io.IOException;

import com.google.gson.Gson;

import me.atticuszambrana.findrapi.model.MembershipStatus;
import me.atticuszambrana.findrapi.model.Profile;
import net.atticusllc.atticus.http.AtticusRequest;

public class FindrWeb {
	
	// Anything we need?
	private Gson gson;
	// Since its not out yet, yeah its going to be localhost for testing purposes
	private String API_ADDRESS = "http://localhost";
	
	public FindrWeb() {
		gson = new Gson();
	}
	
	/**
	 * Get a user profile with the given user ID
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public Profile getProfile(int id) throws IOException {
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/profile/?id=" + id);
		req.make();
		return gson.fromJson(req.getResponse(), Profile.class);
	}
	
	/**
	 * Get the membership status of the given profile object
	 * @param profile
	 * @return
	 * @throws IOException
	 */
	public MembershipStatus getMembershipStatus(Profile profile) throws IOException {
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/get_package?id=" + profile.getID());
		req.make();
		return gson.fromJson(req.getResponse(), MembershipStatus.class);
	}
	
	/**
	 * Get the membership status of the given user id
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public MembershipStatus getMembershipStatus(int id) throws IOException {
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/get_package?id=" + id);
		req.make();
		return gson.fromJson(req.getResponse(), MembershipStatus.class);
	}
}
