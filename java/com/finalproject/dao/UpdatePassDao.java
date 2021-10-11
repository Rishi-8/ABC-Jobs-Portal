package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePassDao {
	
	public int updatePass(String password,String email) throws Exception,SQLException {
		
		int i = 0;
		try {
			String query= "UPDATE programmer SET password=? WHERE email_id=?";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, password);
			ps.setString(2, email);
			i=ps.executeUpdate();
			return i;
		}catch(Exception e) {
			e.printStackTrace();
			ConnectionDB.getConnectionDB().rollback();
			return 0;
		}finally {
			if (ConnectionDB.getConnectionDB()!=null) {
				ConnectionDB.getConnectionDB().close();
			}
		}
		
	}

}
