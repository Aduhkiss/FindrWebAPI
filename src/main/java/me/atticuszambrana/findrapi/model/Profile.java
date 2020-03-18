package me.atticuszambrana.findrapi.model;

public class Profile {

	private int id;
	private String username;
	private String email;
	private String birthday;
	private String firstname;
	private String gender;
	private String looking_for;
	
	public Profile(int id, String username, String email, String birthday, String firstname, String gender, String looking_for) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.birthday = birthday;
		this.firstname = firstname;
		this.gender = gender;
		this.looking_for = looking_for;
	}
	
	public int getID() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getLookingFor() {
		return looking_for;
	}
}
