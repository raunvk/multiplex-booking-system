package com.multiplex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.multiplex.beans.*;

public class MovieDAO {
	
	static Connection con;
	
	

	public Movie searchMovie(Movie movie) {
		
		try {
			
			con = DBUtility.getConnection();
			
			if(con!=null) {
				
				System.out.println("Connection Established!");
				
				String query="select * from movie where movie_name = ?";
				PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
				pstmt.setString(1, movie.getMovieName());
				
				ResultSet rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {		
					
					movie.setMovieId(rs1.getInt(1));
					movie.setMovieName(rs1.getString(2));
					
				}	
				
			}
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		
		return movie;
	}
	
	
	
	public List<Movie> getMovies() {
	
	List<Movie> movies = new ArrayList<>();
	
		try {
			
			con = DBUtility.getConnection();
			
			if(con!=null) {
				
				System.out.println("Connection Established!");
				
				String query="select * from movie";
				PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
				
				ResultSet rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {		
					
					Movie m = new Movie();
					m.setMovieId(rs1.getInt(1));
					m.setMovieName(rs1.getString(2));
					movies.add(m);
					
				}	
				
			}
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		
		return movies;
	}
	
	

	public Shows displayShows(int movieId) {
		
		Shows shows = new Shows();
		
		try {
			
			con = DBUtility.getConnection();
			
			if(con!=null) {
				
				System.out.println("Connection Established!");
				
				String query="select * from shows where movie_id = ?";
				PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
				pstmt.setInt(1, movieId);
				
				ResultSet rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {		
					
					shows.setShowId(rs1.getInt(1));
					shows.setHallId(rs1.getInt(2));
					shows.setMovieId(rs1.getInt(3));
					shows.setSlotNo(rs1.getInt(4));
					shows.setFromDate(rs1.getString(5));
					shows.setToDate(rs1.getString(6));
				
				}	
				
			}
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		
		return shows;
	}
	
}


