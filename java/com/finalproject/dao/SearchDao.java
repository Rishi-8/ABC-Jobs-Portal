package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchDao {
	
	public ResultSet search(String request) throws SQLException,Exception{
		ResultSet rs = null;
		try {
			String query = "Select * from programmer where first_name like'%"+request+"%' or last_name like '%"+request+"%' or company like '"+request+"%' or country like '"+request+"%' or city like '"+request+"%'";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (ConnectionDB.getConnectionDB() != null) {
				ConnectionDB.getConnectionDB().close();
			}
		}
		
	}

}
