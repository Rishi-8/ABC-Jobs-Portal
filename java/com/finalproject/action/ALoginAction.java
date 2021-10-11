package com.finalproject.action;

import java.sql.SQLException;

import com.finalproject.dao.AdminDao;

public class ALoginAction {
	public String message=null;
	private String email,password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	public String execute() throws Exception,SQLException{
		
		AdminDao Dao = new AdminDao();
		
		try {
			boolean check= Dao.login(email, password);
			if (check==false) {
				message="Please check the credentials";
				return "error";
			}else {
				message="Your login is successfull";
				System.out.println("successfull");
			}
		}catch (Exception e) {
			message="There is some error please try after some time";
			e.printStackTrace();
		}
		return "login";
		
	}
	
	
}
