package com.gap;

public class Cow {
	private String uname;
	private String pw;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPw() {
	
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void eat() {

		System.out.println("cow eat grass");
	}
	String address;
	String email;
public void displayInformation() {
	System.out.println("address:"+" "+address);
	System.out.println("email:"+" "+email);
}
}
