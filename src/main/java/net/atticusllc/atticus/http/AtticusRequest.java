package net.atticusllc.atticus.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AtticusRequest {
	
	private String url;
	private String theResponse;
	private int code;
	private String agent;
	
	public AtticusRequest(String url) {
		this.url = url;
		this.agent = "AtticusAPI";
	}
	
	public AtticusRequest(String url, String agent) {
		this.url = url;
		this.agent = agent;
	}
	
	public void make() throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", this.agent);
        this.code = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        theResponse = response.toString();
	}
	
	public String getURL() {
		return url;
	}
	
	public String getResponse() {
		return theResponse;
	}
	
	public int getResponseCode() {
		return code;
	}
	
	public String getAgent() {
		return agent;
	}
}
