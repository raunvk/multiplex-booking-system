package com.multiplex.dao;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import com.multiplex.beans.*;
import java.util.ArrayList;
import java.util.List;

//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletRequest;
 
public class BookingDAO1 {
	static Connection con;
	
	
	public List<Booking> removefrombooking(Booking b) {
		
		List<Booking> bk = new ArrayList<>(); 
		try {
	        
	        con = DBUtility.getConnection();
	        
	        if(con!=null) {
	               
	               System.out.println("Connection Established!");
	               String query3="delete from booking where bookingid = ?";
		
		
				PreparedStatement statement = con.prepareStatement(query3); 
				statement.setInt(1, b.getBookingId());
				statement.execute();
				
				String query4 = "select * from booking";
				PreparedStatement st = con.prepareStatement(query4);
				
				ResultSet rs2 = st.executeQuery();
				
				while(rs2.next()) {
					
					Booking b2 = new Booking();
					b2.setBookingId(rs2.getInt(1));
					b2.setShowId(rs2.getInt(2));
					b2.setUserId(rs2.getInt(3));
					b2.setBookingDate(rs2.getString(4));
					b2.setShowDate(rs2.getString(5));
					bk.add(b2);
				}
					
				}	
		
	}
		catch(Exception e) {
	        
	        e.printStackTrace();
	        System.out.println(e);
	 }
		
		return bk;
	}
	
	
	/*public void removefrombooking(int bookingid) {
	try {
        
        con = DBUtility.getConnection();
        
        if(con!=null) {
               
               System.out.println("Connection Established!");
	String query3="delete from booking where bookingid = ?";
	
	
			PreparedStatement statement = con.prepareStatement(query3); 
		statement.setInt(1, bookingid);
		 statement.executeUpdate();
	
	
}}
	catch(Exception e) {
        
        e.printStackTrace();
        System.out.println(e);
 }}*/
    //pstmt3.setString(1,p);
    
	
	
	public Booking searchBooking(Booking booking) {
        
        try {
               
               con = DBUtility.getConnection();
               
               if(con!=null) {
                      
                      System.out.println("Connection Established!");
                      
                      String query="select * from booking where BookingId = ?";
                      PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
                      pstmt.setInt(1, booking.getBookingId());
                      
                      ResultSet rs1 = pstmt.executeQuery();
                      
                      while(rs1.next()) {       
                            
                            booking.setBookingId(rs1.getInt(1));
                            booking.setShowId(rs1.getInt(2));
                            booking.setUserId(rs1.getInt(3));
                            booking.setBookingDate(rs1.getString(4));
                            booking.setShowDate(rs1.getString(5));
                           
                      }      
                      
               }
        
        }
        
        catch(Exception e) {
               
               e.printStackTrace();
               System.out.println(e);
        }
        
        return booking;
  }
  
  

	
	
	
	
	
	
	
	public List<Booking> getBookings() {
	       
	       List<Booking> booking = new ArrayList<>();
	       
	             try {
	                    
	                    con = DBUtility.getConnection();
	                    
	                    if(con!=null) {
	                           
	                           System.out.println("Connection Established!");
	                           
	                           String query="select * from booking ";
	                           PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
	                           
	                           ResultSet rs1 = pstmt.executeQuery();
	                           
	                           while(rs1.next()) {       
	                                 
	                                 Booking b = new Booking();
	                                 b.setBookingId(rs1.getInt(1));
	                                 b.setShowId(rs1.getInt(2));
	                                 b.setUserId(rs1.getInt(3));
	                                 b.setBookingDate(rs1.getString(4));
	                                 b.setShowDate(rs1.getString(5));
	                                 booking.add(b);
	                                 
	                           }      
	                           
	                    }
	             
	             }
	             
	             catch(Exception e) {
	                    
	                    e.printStackTrace();
	                    System.out.println(e);
	             }
	             
	             return booking;
	       }

	
}
