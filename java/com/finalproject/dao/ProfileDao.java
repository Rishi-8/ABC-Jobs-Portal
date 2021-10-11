package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.finalproject.dao.ConnectionDB;

public class ProfileDao {
	
	public ResultSet report(String email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String query = "SELECT * FROM programmer where email_id = ?";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			return rs;
		} catch(Exception e){
			 e.printStackTrace();
			 return null;
		}finally {
			if (ConnectionDB.getConnectionDB() != null) {
				ConnectionDB.getConnectionDB().close();
				}
	}
	}

}
