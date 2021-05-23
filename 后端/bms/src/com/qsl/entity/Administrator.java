package com.qsl.entity;

public class Administrator {
	private int adminID;
	private String adminName;
	private String adminPWD;
	private String adminSEX;
	public Administrator() {
		super();
	}
	public Administrator(int adminID, String adminName, String adminPWD, String adminSEX) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
		this.adminPWD = adminPWD;
		this.adminSEX = adminSEX;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPWD() {
		return adminPWD;
	}
	public void setAdminPWD(String adminPWD) {
		this.adminPWD = adminPWD;
	}
	public String getAdminSEX() {
		return adminSEX;
	}
	public void setAdminSEX(String adminSEX) {
		this.adminSEX = adminSEX;
	}
	
}
