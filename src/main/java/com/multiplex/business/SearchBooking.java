package com.multiplex.business;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Booking;
import com.multiplex.dao.*;


@WebServlet("/SearchBooking")
public class SearchBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//PrintWriter pw = response.getWriter();	
		
		BookingDAO1 bDAO = new BookingDAO1();
		
//List<Booking> bookings = bDAO.searchBooking();
		List<Booking> booking=bDAO.getBookings();
		request.setAttribute("bookings", booking);
		request.getRequestDispatcher("/displayBooking.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
