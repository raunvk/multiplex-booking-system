package com.multiplex.business;

public class UserDetails {
	private String userName;
	private char userType;
	private long mobileNo;
	private String emailId;
	private String password;
	public UserDetails(String userName, char userType, long mobileNo, String emailId, String password) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public char getUserType() {
		return userType;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getPassword() {
		return password;
	}
	
}