package com.multiplex.dao;

import com.multiplex.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.multiplex.beans.*;
import java.sql.Statement;
public class HallCapacityDAO {

	static Connection con;
	/*public HallCapacity checkCapacity(int SeatCount)
	{
		HallCapacity capacity = new HallCapacity();
		try {
			con = DBUtility.getConnection();
			
			if(con!=null) {
				
				String query = "select SeatCount from HallCapacity";
				PreparedStatement pstmt = (PreparedStatement)con.prepareStatement(query);
				pstmt.setInt(1, SeatCount);
				
				ResultSet rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {
					capacity.setSeatCount(rs1.getInt(3));
				}
			
		}
		
		}
		catch(Exception e) {
            
            e.printStackTrace();
            System.out.println(e);
     }
		return capacity;
		*/
		
	public void checkCapacity(int available,int hallid,int seatid) throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getConnection();
		Statement st = con.createStatement();
		st.execute("update hallcapacity set Seat_available = "+available+" where hall_id="+hallid+
				" and seat_type ="+seatid);
		con.commit();
		
}
}
