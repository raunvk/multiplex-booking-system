package com.multiplex.beans;

import java.util.Date;

public class Booking {
	
	private int bookingId;
	private int showId;
	private int userId ;
	private String bookingDate;
	private String ShowDate;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingid) {
		this.bookingId = bookingid;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showid) {
		this.showId = showid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userid) {
		this.userId = userid;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingdate) {
		this.bookingDate = bookingdate;
	}
	public String getShowDate() {
		return ShowDate;
	}
	public void setShowDate(String showDate) {
		ShowDate = showDate;
	}
	public Booking(int showId, int userId, String bookingDate, String showDate) {
		super();
		this.showId = showId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		ShowDate = showDate;
	}
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingId + ", showid=" + showId + ", userid=" + userId + ", bookingdate="
				+ bookingDate + ", ShowDate=" + ShowDate + "]";
	}
	
	
}
	
	
	