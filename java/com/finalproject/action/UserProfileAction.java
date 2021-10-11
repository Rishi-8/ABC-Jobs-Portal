package com.finalproject.action;

import java.sql.ResultSet;
import com.finalproject.dao.UserProfileDao;

public class UserProfileAction {
	private String id="",firstname = "",lastname = "",gender = "",company = "",country = "",city = "",email="";

	ResultSet rs = null;
	UserProfileDao Dao = new UserProfileDao();
	
	public String execute() throws Exception{
		
		try {
			rs=Dao.view(id.trim());
			if (rs != null) {
				while (rs.next()) {
					firstname = rs.getString("first_name");
					lastname = rs.getString("last_name");
					gender = rs.getString("gender");
					company = rs.getString("company");
					country = rs.getString("country");
					city = rs.getString("city");
					email=rs.getString("email_id");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "VIEW";
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
