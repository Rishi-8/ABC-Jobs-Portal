package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.finalproject.dao.ConnectionDB;

public class Logindao{
	
	public boolean validate(String email,String password) throws Exception,SQLException{
		boolean status=false;
		
		try {
			String query = "select * from programmer where email_id=? and password=?"; 
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			status=rs.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

}
