package com.finalproject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {
	
	public boolean login(String email,String password) throws Exception,SQLException{
		boolean status=false;
		
		try {
			String query = "select * from admin where email_id=? and password=?"; 
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
	
	
	
	
	public ResultSet monitor() throws SQLException, Exception {
		ResultSet rs = null;
			try {
				String query = "SELECT * FROM programmer";
				PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
				rs = ps.executeQuery();
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				if (ConnectionDB.getConnectionDB()!= null) {
					ConnectionDB.getConnectionDB().close();
			}
		}
	}
	
	
	
	public int delete(String id) throws SQLException,Exception{
		ConnectionDB.getConnectionDB().setAutoCommit(false);
		int i=0;
		try {
			String query = "delete from programmer where programmer_id=?";
			PreparedStatement ps = ConnectionDB.getConnectionDB().prepareStatement(query);
			ps.setString(1, id);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e){
			e.printStackTrace();
			ConnectionDB.getConnectionDB().rollback();
			return 0;
		}finally {
			if (ConnectionDB.getConnectionDB() != null) {
				ConnectionDB.getConnectionDB().close();
			}
		}
		
	}
	
}
