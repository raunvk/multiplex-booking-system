package com.multiplex.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Booking;
import com.multiplex.dao.BookingDAO1;

/**
 * Servlet implementation class SearchBooking2
 */
@WebServlet("/SearchBooking2")
public class SearchBooking2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooking2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		BookingDAO1 bdao = new BookingDAO1();
		
		int bookingId = Integer.parseInt(request.getParameter("bookingId"));
		
		Booking b = new Booking();
		
		b.setBookingId(bookingId);
		
		Booking b2 = bdao.searchBooking(b);
		
		if(b.getBookingId()==0) {
			Booking b0 = new Booking();
			b0.setBookingId(0);
			b0.setUserId(0);
			b0.setShowId(0);
			b0.setBookingDate(null);
			b0.setShowDate(null);
			request.setAttribute("booking", b0);
			request.getRequestDispatcher("/displayBooking2.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("booking", b);
			request.getRequestDispatcher("/displayBooking2.jsp").forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
