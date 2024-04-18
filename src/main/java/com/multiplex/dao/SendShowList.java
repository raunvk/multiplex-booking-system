package com.multiplex.dao;

import com.multiplex.beans.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SendShowList {
	
		public List<Shows> sendshowlist() throws ClassNotFoundException, SQLException {
			List<Shows> showlist = new ArrayList<>();
			Connection con = DBUtility.getConnection();
			Statement s = con.createStatement();
			ResultSet rq = s.executeQuery("Select * from shows");
			while(rq.next()) {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				int showId = rq.getInt(1);
				int hallId = rq.getInt(2);
				int movidId = rq.getInt(3);
				int slotId = rq.getInt(4);
				String fromdate =dateFormat.format(rq.getDate(5));
				String todate = dateFormat.format(rq.getDate(6));
				Shows s1 = new Shows();
				s1.setShowId(showId);
				s1.setHallId(hallId);
				s1.setMovieId(slotId);
				s1.setSlotNo(slotId);
				s1.setFromDate(fromdate);
				s1.setToDate(todate);
				showlist.add(s1);
	 		}
			return showlist;
			
		}

}
