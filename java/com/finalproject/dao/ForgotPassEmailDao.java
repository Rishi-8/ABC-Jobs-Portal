package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgotPassEmailDao {
	
	public boolean validate(String email) throws Exception,SQLException{
		boolean status=false;
		
		try {
			String query = "select * from programmer where email_id=?"; 
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			status=rs.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

}
