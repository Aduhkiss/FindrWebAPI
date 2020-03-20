package me.atticuszambrana.findrapi.model;

public class FindrError {
	private boolean error;
	private String reason;
	
	public FindrError(String error, String reason) {
		this.error = Boolean.valueOf(error);
		this.reason = reason;
	}
	
	public boolean isError() {
		return error;
	}
	
	public String getReason() {
		return reason;
	}
}
