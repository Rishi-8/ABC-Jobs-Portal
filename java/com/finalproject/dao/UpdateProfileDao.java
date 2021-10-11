package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.finalproject.dao.ConnectionDB;

public class UpdateProfileDao {
	
	public int updateProgrammer(String firstname,String lastname,String country,String city,String company,String email) throws SQLException, Exception{
		
		int i = 0;
		try {
			String query = "UPDATE programmer SET first_name=?,last_name=?,country=?,city=?,company=? WHERE email_id=?";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, country);
			ps.setString(4, city);
			ps.setString(5, company);
			ps.setString(6, email);
			i = ps.executeUpdate();
			return i;			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (ConnectionDB.getConnectionDB()!= null) {
				ConnectionDB.getConnectionDB().close();
			}
		}
		
	}

}
