package com.qsl.entity;

public class Reader {
	private int readerSno;
	private String readerName;
	private String readerSex;
	private String readerDepartment;
	private String readerProfession;
	private int readerPWD;
	public Reader() {
		super();
	}
	public Reader(int readerSno, String readerName, String readerSex, String readerDepartment, String readerProfession,
			int readerPWD) {
		super();
		this.readerSno = readerSno;
		this.readerName = readerName;
		this.readerSex = readerSex;
		this.readerDepartment = readerDepartment;
		this.readerProfession = readerProfession;
		this.readerPWD = readerPWD;
	}
	public int getReaderSno() {
		return readerSno;
	}
	public void setReaderSno(int readerSno) {
		this.readerSno = readerSno;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public String getReaderSex() {
		return readerSex;
	}
	public void setReaderSex(String readerSex) {
		this.readerSex = readerSex;
	}
	public String getReaderDepartment() {
		return readerDepartment;
	}
	public void setReaderDepartment(String readerDepartment) {
		this.readerDepartment = readerDepartment;
	}
	public String getReaderProfession() {
		return readerProfession;
	}
	public void setReaderProfession(String readerProfession) {
		this.readerProfession = readerProfession;
	}
	public int getReaderPWD() {
		return readerPWD;
	}
	public void setReaderPWD(int readerPWD) {
		this.readerPWD = readerPWD;
	}
	
}	
