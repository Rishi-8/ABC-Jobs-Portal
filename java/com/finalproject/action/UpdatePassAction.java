package com.finalproject.action;

import com.finalproject.dao.UpdatePassDao;

public class UpdatePassAction {
	
	private String email;
	private String password;
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
	
	public String execute() throws Exception{
		
		UpdatePassDao Dao = new UpdatePassDao();
		int update = Dao.updatePass(password, email);
		if (update>0) {
			System.out.println("The password is changed");
		}else {
			System.out.println("There was an error in changing the password");
		}
		return "update";
		
	}

}
