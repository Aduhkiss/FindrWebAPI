package me.atticuszambrana.findrapi;

import java.io.IOException;

import com.google.gson.Gson;

import me.atticuszambrana.findrapi.model.MembershipStatus;
import me.atticuszambrana.findrapi.model.Profile;
import me.atticuszambrana.findrapi.model.TokenResponse;
import net.atticusllc.atticus.http.AtticusRequest;

public class FindrWeb {
	
	// Anything we need?
	private Gson gson;
	// Since its not out yet, yeah its going to be localhost for testing purposes
	private String API_ADDRESS = "http://localhost";
	
	private String TOKEN;
	
	public FindrWeb() {
		gson = new Gson();
	}
	
	private boolean errorCheck() {
		
	}
	
	
	/**
	 * Set the token that the API will use for all further requests
	 * @param token
	 */
	public void setToken(String token) {
		this.TOKEN = token;
	}
	
	/**
	 * Will return the token that is currently being used for all requests.
	 * @return
	 */
	public String getToken() {
		return TOKEN;
	}
	
	/**
	 * Will login with the API, and will give you an authorization token to use with any further requests. You can only have ONE token per account.
	 * So if you request again, you will get the same token that you got before
	 * @param email
	 * @param password
	 * @throws IOException
	 */
	public void login(String email, String password) throws IOException {
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/token?type=GET_TOKEN&email=" + email + "&password=" + password);
		req.make();
		try {
			
		}
		TokenResponse response = gson.fromJson(req.getResponse(), TokenResponse.class);
		setToken(response.getToken());
	}
	
	/**
	 * Get a user profile with the given user ID
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public Profile getProfile(int id) throws IOException {
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/profile/?id=" + id, "FindrJavaWrapper", TOKEN);
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
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/get_package?id=" + profile.getID(), "FindrJavaWrapper", TOKEN);
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
		AtticusRequest req = new AtticusRequest(API_ADDRESS + "/api/v1/get_package?id=" + id, "FindrJavaWrapper", TOKEN);
		req.make();
		return gson.fromJson(req.getResponse(), MembershipStatus.class);
	}
}
