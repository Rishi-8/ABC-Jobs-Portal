package com.finalproject.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.finalproject.dao.Logindao;

public class LoginAction implements SessionAware{
	
	private String email,password;
	SessionMap<String, Object>sessionMap;

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
		Logindao Dao = new Logindao();
		
		try {
			boolean check = Dao.validate(email, password);
			if (check == false) {
				return "error";
			}else {
				sessionMap.put("login", "true");
				sessionMap.put("Email", email);	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "login";
			
	}

	public void setSession(Map<String, Object> map) {
		this.sessionMap = (SessionMap<String, Object>) map;	
	}
	
	public String logout(){  
	    sessionMap.invalidate();  
	    return "success";  
	} 

}
