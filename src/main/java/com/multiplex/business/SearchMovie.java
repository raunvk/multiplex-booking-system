package com.multiplex.business;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multiplex.beans.Movie;
import com.multiplex.dao.*;

/**
 * Servlet implementation class SearchMovie
 */
@WebServlet("/SearchMovie")
public class SearchMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchMovie() {
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
		
		String movieName = request.getParameter("movieName");
		
		Movie movie = new Movie();
		
		movie.setMovieName(movieName);
		
		Movie m = mDAO.searchMovie(movie);
		
		if(m.getMovieId()==0) {
			
			Movie m0 = new Movie();
			m0.setMovieName("Movie Not Found");
			
			request.setAttribute("movies", m0);
			request.getRequestDispatcher("/QueryDetails2.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("movies", m);
			request.getRequestDispatcher("/QueryDetails2.jsp").forward(request, response);
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