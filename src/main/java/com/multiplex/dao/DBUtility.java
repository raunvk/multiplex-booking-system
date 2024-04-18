package com.multiplex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DBUtility {
	
	static boolean flag=true;
	static Scanner s=new Scanner(System.in);
	static String username="root";
	static String password="root";
	static String dbName="multiplexdb";
	static String driverName="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/";
	static Connection con;
	
	public static Connection getConnection() {
		
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url+dbName, username, password);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

}