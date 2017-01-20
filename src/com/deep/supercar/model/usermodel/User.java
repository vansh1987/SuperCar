package com.deep.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

public class User 
{
	private int userid;
	private String username;
	private String password;
	private Date dob;
	private String gender;
	private Set<address> addresses;
	
	public int getUserid() 
	{
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<address> addresses) {
		this.addresses = addresses;
	}
	
	
}
