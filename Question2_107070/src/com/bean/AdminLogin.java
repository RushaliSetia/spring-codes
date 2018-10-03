package com.bean;

public class AdminLogin {

	private String unm;
	private String pwd;

	public AdminLogin() {
		super();
	}

	public AdminLogin(String unm, String pwd) {
		super();
		this.unm = unm;
		this.pwd = pwd;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "AdminLogin [unm=" + unm + ", pwd=" + pwd + "]";
	}

}
