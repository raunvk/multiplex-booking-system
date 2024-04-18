package com.multiplex.business;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.lang.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.*;
import com.multiplex.dao.BookingDAO;
import com.multiplex.dao.HallCapacityDAO;
import com.multiplex.dao.*;

/*servlet class for booking the seats.
 * 
 */

@WebServlet("/BookSeats")
public class BookSeats extends HttpServlet {
	
	
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSeats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hallname = request.getParameter("Hall");
		String seattype = request.getParameter("SeatType");
		int availableseat  = Integer.parseInt(request.getParameter("SeatAvailable")); 
		int userid =Integer.parseInt(request.getParameter("uid"));
		int halid = Integer.parseInt(request.getParameter("Hallid"));
		int seatid = Integer.parseInt(request.getParameter("Seatid"));
		String mname = request.getParameter("Mname");
		
		Random random = new Random();  
		int y = random.nextInt(9999); 
		
		int bookingid = y;
		int showid = Integer.parseInt(request.getParameter("ShowId"));
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String showdate = request.getParameter("showdate");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate showdate1 = LocalDate.parse(showdate, formatter);
		Date showdate2 = java.sql.Date.valueOf(showdate1);
		String d2 = dateFormat.format(showdate2);
		
		
		LocalDate todays_date = LocalDate.now();
		Date today1 = java.sql.Date.valueOf(todays_date);
		String d1 = dateFormat.format(today1);
		
		
		int available = -1;
		int noonseat = Integer.parseInt(request.getParameter("noofseat"));
		
		Booking book1 = new Booking();
		
		
		book1.setBookingId(bookingid);
		book1.setBookingDate(d1);
		book1.setShowDate(d2);
		book1.setShowId(showid);
		book1.setUserId(userid);
		
		
		BookingDetails details = new BookingDetails(bookingid, seatid,availableseat );
		
		BookingDAO b1= new BookingDAO();
		BookingDetailsDAO b2= new BookingDetailsDAO();
		
		HallCapacityDAO cap = new HallCapacityDAO();
		
		try { 
			//available = cap.HallCapacityDAO(halid,seatid);
			b1.booking(book1);
			b2.bookingdetails(details);
			
			
		}
		catch(ClassNotFoundException | SQLException e) { 
			
			e.printStackTrace();
		}
	    
		response.getWriter().append(bookingid+" "+halid+" "+seatid);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
    }
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
}
}
