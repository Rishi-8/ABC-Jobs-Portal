package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserProfileDao {
	
	public ResultSet view(String id) throws SQLException,Exception{
		
		ResultSet rs = null;
		
		try {
			String query="select * from programmer where programmer_id=?";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			return rs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			if (ConnectionDB.getConnectionDB() != null) {
				ConnectionDB.getConnectionDB().close();
			}
		}
		
	}

}
