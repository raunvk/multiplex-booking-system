package com.multiplex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.multiplex.beans.BookingDetails;

public class BookingDetailsDAO {
	public void bookingdetails(BookingDetails bd) throws ClassNotFoundException ,SQLException
	{
		Connection con = DBUtility.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into bookingdetal values(?,?,?)");
		ps.setInt(1, bd.getBookingid());
		ps.setInt(2, bd.getSeattypeid());
		ps.setInt(3, bd.getNoofseat());
		ps.execute();
		con.commit();
		
	}

}
