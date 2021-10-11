package com.finalproject.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.finalproject.bean.Programmer;
import com.finalproject.dao.SearchDao;

public class SearchAction {
	
	ResultSet rs = null;
	Programmer bean = null;
	ArrayList<Programmer> beanList = null;
	SearchDao search = new SearchDao();
	private boolean noData = false;
	private String request;
	
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	
	public String execute() throws Exception{
		try {
			beanList = new ArrayList<Programmer>();
			rs = search.search(request);
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new Programmer();
					bean.setId(rs.getString("programmer_id"));
					bean.setFirstname(rs.getString("first_name"));
					bean.setLastname(rs.getString("last_name"));
					bean.setCompany(rs.getString("company"));
					bean.setCountry(rs.getString("country"));
					bean.setCity(rs.getString("city"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
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
