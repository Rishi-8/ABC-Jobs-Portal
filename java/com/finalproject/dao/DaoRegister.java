package com.finalproject.dao;

import java.sql.PreparedStatement;
import com.finalproject.dao.ConnectionDB;

public class DaoRegister {
	
	public int registerProgrammer(String firstname, String lastname, String email, String gender, String password) throws Exception {
		
		int i = 0;
		try {
			
			String query = "insert into programmer(programmer_id, first_name, last_name, email_id, gender, password) values(NULL,?,?,?,?,?)";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setString(4, gender);
			ps.setString(5, password);
			
			i = ps.executeUpdate();
			return i;
			
		}catch (Exception e) {
			e.printStackTrace();
			return i;
			
			
		}finally {
			if (ConnectionDB.getConnectionDB() != null) {
				ConnectionDB.getConnectionDB().close();
				}
				}
				
	}

}
