package com.multiplex.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.multiplex.beans.Shows;
import com.multiplex.dao.MovieDAO;

/**
 * Servlet implementation class DisplayShows
 */
@WebServlet("/DisplayShows")
public class DisplayShows extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayShows() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		MovieDAO mDAO = new MovieDAO();
		
		String mId = request.getParameter("mId");
		
		
		int mId2 = Integer.parseInt(mId);
		
		
		Shows s = mDAO.displayShows(mId2);
		
		
		if(s.getShowId()==0) {
			
			Shows s0 = new Shows();
			s0.setMovieId(0);
			s0.setHallId(0);
			s0.setSlotNo(0);
			s0.setFromDate("No Shows Available");
			s0.setToDate("No Shows Avaliable");
			
			request.setAttribute("shows", s0);
			request.getRequestDispatcher("/QueryDetails3.jsp").forward(request, response);
			//request.getRequestDispatcher("/bookSeats").forward(request, response);
		}
		
		else {
			request.setAttribute("shows", s);
			request.getRequestDispatcher("/QueryDetails3.jsp").forward(request, response);
			//request.getRequestDispatcher("/bookSeats").forward(request, response);
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
