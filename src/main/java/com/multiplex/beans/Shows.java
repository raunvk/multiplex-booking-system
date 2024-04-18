package com.multiplex.beans;

public class Shows {
	
	private int showId;
	private int hallId;
	private int movieId;
	private int slotNo;
	private String fromDate;
	private String toDate;
	
	
	
	public Shows(int showId, int hallId, int movieId, int slotNo, String fromDate, String toDate) {
		super();
		this.showId = showId;
		this.hallId = hallId;
		this.movieId = movieId;
		this.slotNo = slotNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
	public Shows() {
		super();
	}

	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	

}