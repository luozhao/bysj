package com.bcsf.fzw.login.model;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;
	private String usex;
	private String ubirthday;
	private String uphone;
	private String uemail;
	private String uctime;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String uname, String upwd, String uemail) {
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
	}

	/** full constructor */
	public TUser(String uname, String upwd, String usex, String ubirthday,
			String uphone, String uemail, String uctime) {
		this.uname = uname;
		this.upwd = upwd;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.uphone = uphone;
		this.uemail = uemail;
		this.uctime = uctime;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUsex() {
		return this.usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUbirthday() {
		return this.ubirthday;
	}

	public void setUbirthday(String ubirthday) {
		this.ubirthday = ubirthday;
	}

	public String getUphone() {
		return this.uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUctime() {
		return this.uctime;
	}

	public void setUctime(String uctime) {
		this.uctime = uctime;
	}

}