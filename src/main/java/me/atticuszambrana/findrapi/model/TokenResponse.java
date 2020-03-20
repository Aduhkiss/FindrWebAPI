package me.atticuszambrana.findrapi.model;

public class TokenResponse {
	private boolean tokenNew;
	private String AuthToken;
	
	public TokenResponse(String tokenNew, String AuthToken) {
		this.tokenNew = Boolean.valueOf(tokenNew);
		this.AuthToken = AuthToken;
	}
	
	public boolean isTokenNew() {
		return tokenNew;
	}
	
	public String getToken() {
		return AuthToken;
	}
}
