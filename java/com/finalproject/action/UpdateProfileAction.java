package com.finalproject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.finalproject.dao.UpdateProfileDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateProfileAction extends ActionSupport{
	
	private static final long serialVersionUID = 874196563641421834L;
	private String firstname;
	private String lastname;
	private String country;
	private String city;
	private String company;
	
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String execute() throws Exception{
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		if(session == null || session.getAttribute("login")==null) {
			return "false";
		}
		
		else {
			String email = (String)session.getAttribute("Email");
			UpdateProfileDao dao = new UpdateProfileDao();
			int update = dao.updateProgrammer(firstname, lastname, country, city, company, email);
			if (update > 0) {
			System.out.println("The user profile is updated");
			}else {
				System.out.println("There was an error while updating the profile"); 
			}
		}
		return "Update";
	}
	
	public String updateProfile() {
		return "return";
	} 

}
