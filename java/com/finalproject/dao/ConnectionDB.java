package com.finalproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
	public static Connection getConnectionDB() throws Exception {
		System.out.println("Loading Driver .....");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded .....");
			System.out.println("Connecting .....");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_jobs","root","");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There was a problem in connecting .....");
			return null;
		}
		
		 
}
}
