package com.finalproject.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.finalproject.bean.Programmer;
import com.finalproject.dao.ProfileDao;
import com.opensymphony.xwork2.ActionSupport;

public class ProfileAction extends ActionSupport{
	
	private static final long serialVersionUID = -1488302973428131078L;
	ResultSet rs = null;
	Programmer bean = null;
	ProfileDao profiledao = new ProfileDao();
	ArrayList<Programmer> beanList = null;
	private boolean noData = false;
	
	public String execute() throws SQLException, Exception  {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		String s=(String)session.getAttribute("login");
		if(s!=null){  
			
			String email = (String)session.getAttribute("Email");
			beanList = new ArrayList<Programmer>();
			rs= profiledao.report(email);
			int i = 0;
			if (rs != null) {
	        	while (rs.next()) {
	        	i++;
	        	bean = new Programmer();
	        	bean.setFirstname(rs.getString("first_name"));
	        	bean.setLastname(rs.getString("last_name"));
	        	bean.setGender(rs.getString("gender"));
	        	bean.setEmail(rs.getString("email_id"));
	        	bean.setCity(rs.getString("city"));
	        	bean.setCountry(rs.getString("country"));
	        	bean.setCompany(rs.getString("company"));
	        	beanList.add(bean);
	        	}
	        }
			if (i == 0) {
	        	noData = false;
	        } else {
	        	noData = true;
	        }
		    return "success"; 
	    }
		        else {
			    return "error";
			    }
		        }
	public boolean isNoData() {
		return noData;
		}
		public void setNoData(boolean noData) {
		this.noData = noData;
		}
		
		public ArrayList<Programmer> getBeanList(){
			return beanList;
		}
		public void setBeanList(ArrayList<Programmer> beanList) {
			this.beanList = beanList;
		}
		
	
	
	

}
