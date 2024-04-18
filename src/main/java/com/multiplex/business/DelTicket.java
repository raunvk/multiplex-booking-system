package com.multiplex.business;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Booking;
import com.multiplex.dao.BookingDAO1;

/**
 * Servlet implementation class DelTicket
 */
@WebServlet("/DelTicket")
public class DelTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		BookingDAO1 bdao1 = new BookingDAO1();
		
		int bookingid = Integer.parseInt(request.getParameter("bId"));
		
			Booking b = new Booking();
			
			b.setBookingId(bookingid);
			
			List<Booking> bk2 = bdao1.removefrombooking(b);
			
			request.setAttribute("booking", bk2);
		request.getRequestDispatcher("/displayCancel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
