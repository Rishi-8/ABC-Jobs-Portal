package com.finalproject.action;

import com.finalproject.dao.AdminDao;

public class ADeleteAction {
	
	String id,msg;
	AdminDao Dao = new  AdminDao();
	
	
	public String execute() throws Exception{
		try {
			int isDeleted = Dao.delete(id);
			if (isDeleted>0) {
				msg = "User is deleted from the DB";
				System.out.println("success");
			} else {
				msg = "Sorry, some erorr";
				System.out.print("Sorry");
			}
		}catch(Exception e){
			e.printStackTrace();	
			}
		return "DELETE";
		}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
