package com.finalproject.action;

import com.finalproject.dao.DaoRegister;

public class RegisterAction {
	
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String password;
	
	

	private String msg = "";
	private int ctr = 0;
	DaoRegister daoRegister = null;

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public String execute() throws Exception{
		daoRegister = new DaoRegister();
		
		try {
			ctr = daoRegister.registerProgrammer(firstname, lastname, email, gender, password);
			if (ctr > 0) {
				msg = "Thank you,";
			}
			else {
				msg = "Your Registration encountered an error";
			} 
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "Register";
		}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	}
	
	


