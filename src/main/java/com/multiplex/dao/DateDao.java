package com.multiplex.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Booking;


public class DateDao {
	public int reportMethod(String fromdate,String todate) {
		int sum1=0;	
		try {
			String query = "select sum(price) as totalearnings from booking where  date>=? and date<=?";
			Connection con=DBUtility.getConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, fromdate);
			pstmt.setString(2, todate);
			ResultSet rs=pstmt.executeQuery();
			
			while (rs.next()) {
			    sum1 = rs.getInt(1);
			   
			}
			System.out.println(sum1);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return sum1;
	}
}
