package com.multiplex.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.multiplex.beans.ShowUsers;


public class SendShowUserList {
	
	
		public List<ShowUsers> SendShowUserList() throws ClassNotFoundException, SQLException {
			List<ShowUsers> showuser = new ArrayList<>();
			Connection con = DBUtility.getConnection();
			PreparedStatement p = con.prepareStatement("select s.show_id as show_id, h.hallname as hall,m.movie_name as movie_name,\r\n"
					+ "s.slot_no as slot_id, st.seat_type as seat_type, hc.seat_count as total_seat,\r\n"
					+ "hc.seat_availability as seat_availability, st.seat_fare as price,\r\n"
					+ "s.fromdate as fromdate, s.todate as todate, \r\n"
					+ "m.movie_id , h.hall_id , st.seat_id from \r\n"
					+ "shows s inner join hall h on s.hall_id =h.hall_id\r\n"
					+ "inner join hallcapacity hc on s.hall_id =hc.hall_id\r\n"
					+ "inner join seat_type st on hc.seat_type = st.seat_id\r\n"
					+ "inner join movies m on s.movie_id = m.movie_id ; ");
			
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				int showId = rs.getInt(1);
				String hall = rs.getString(2);
				String mname= rs.getString(3);
				int slotId = rs.getInt(4);
				String seatType = rs.getString(5);
				int totalSeat = rs.getInt(6);
				int seatAvailable = rs.getInt(7);
				float price = rs.getFloat(8);
				String fromdate = rs.getString(9);
				String todate = rs.getString(10);
				String link = rs.getString(11);
				int mid = rs.getInt(12);
				int hallid = rs.getInt(13);
				int Seatid = rs.getInt(14);
				showuser.add(new ShowUsers(showId, hall, mname, slotId, seatType, 
						totalSeat, seatAvailable, price, fromdate, todate,link,mid,hallid,Seatid));
			}
			return showuser;
		}
}

	
		


