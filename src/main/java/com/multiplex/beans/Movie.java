package com.multiplex.beans;

public class Movie {
	
	private int movieId;
	private String movieName;
	
	public Movie(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Movie() {
		super();
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
