package com.multiplex.dao;
//create table shows (show_id int auto_increment primary key,hall_id int ,foreign key(hall_id) references hall(hall_id),
// movie_id int,foreign key(movie_id) references movie(movie_id),slot_no int,fromdate date, todate date);
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Shows;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PublishShowDetailsDao {
	public void publishShowDetailsMethod(HttpServletRequest request, HttpServletResponse response) {
		try {
			boolean flag1=false;
			Connection con=DBUtility.getConnection();
			PreparedStatement st1=con.prepareStatement("insert into movie values(?,?)");
			String movieName1=request.getParameter("MovieName");
			ResultSet rs1=st1.executeQuery("select movie_name from movie");
			while(rs1.next()) {
				String movieName3=rs1.getString("movie_name");
				if(movieName1.equals(movieName3)) {
					flag1=true;
				}
			}
			if(!flag1) {
				st1.setInt(1, 0);
				st1.setString(2, movieName1);
				st1.executeUpdate();
			}
			PreparedStatement st=con.prepareStatement("insert into shows values(?,?,?,?,?,?)");
			ResultSet rs=st1.executeQuery("select movie_id, movie_name from movie");
			int movieId2=0;
			while(rs.next()) {
				String movieName2=rs.getString("movie_name");
				if(movieName1.equals(movieName2)) {
					movieId2=rs.getInt("movie_id");
				}
			}
			String hallName1=request.getParameter("HallId");
			char temp1=hallName1.charAt(6);
			int hallId1=temp1-48;
			String slotName1=request.getParameter("SlotNo");
			char temp2=slotName1.charAt(0);
			int slotId1=temp2-48;
			System.out.println(hallId1+" "+slotId1+" "+movieName1);
			String fromDate1=request.getParameter("FromDate");
			String toDate1=request.getParameter("ToDate");
			st.setInt(1, 0);
			st.setInt(2, hallId1);
			st.setInt(3,movieId2);
			st.setInt(4, slotId1);
			st.setString(5, fromDate1);
			st.setString(6, toDate1);
			st.executeUpdate();
			st.close();
			st1.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
