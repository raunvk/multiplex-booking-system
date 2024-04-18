package com.multiplex.dao;
import com.multiplex.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.multiplex.*;
import java.sql.Date;

public class BookingDAO {
	
	
		public void booking(Booking b) throws ClassNotFoundException ,SQLException{
			
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into booking values(?,?,?,?,?)");
			ps.setInt(1, b.getBookingId());
			ps.setInt(2, b.getShowId());
			ps.setInt(3, b.getUserId());
			ps.setString(4, b.getBookingDate());
			ps.setString(5, b.getShowDate() );
			ps.execute();
			con.commit();
		}

}
