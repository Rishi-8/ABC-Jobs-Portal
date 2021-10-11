package com.finalproject.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.finalproject.bean.Programmer;
import com.finalproject.dao.AdminDao;

public class AMonitorAction {
	
	ResultSet rs = null;
	Programmer bean = null;
	ArrayList<Programmer> beanList = null;
	AdminDao Dao = new AdminDao();
	private boolean noData = false;
	
	
	
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<Programmer>();
			rs = Dao.monitor();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new Programmer();
					bean.setId(rs.getString("programmer_id"));
					bean.setFirstname(rs.getString("first_name"));
					bean.setLastname(rs.getString("last_name"));
					bean.setEmail(rs.getString("email_id"));
					bean.setGender(rs.getString("gender"));
					bean.setCountry(rs.getString("country"));
					bean.setCity(rs.getString("city"));
					bean.setCompany(rs.getString("company"));
					beanList.add(bean);
				}
			}
			if(i == 0) {
				noData=false;
			} else {
				noData=true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "DETAILS";
	}



	public ArrayList<Programmer> getBeanList() {
		return beanList;
	}



	public void setBeanList(ArrayList<Programmer> beanList) {
		this.beanList = beanList;
	}



	public boolean isNoData() {
		return noData;
	}



	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	

}
