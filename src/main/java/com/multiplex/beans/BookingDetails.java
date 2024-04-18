package com.multiplex.beans;

public class BookingDetails {
	
	private int bookingid;
	private int seattypeid;
	private int noofseat;
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getSeattypeid() {
		return seattypeid;
	}
	public void setSeattypeid(int seattypeid) {
		this.seattypeid = seattypeid;
	}
	public int getNoofseat() {
		return noofseat;
	}
	public void setNoofseat(int noofseat) {
		this.noofseat = noofseat;
	}
	public BookingDetails(int bookingid, int seattypeid, int noofseat) {
		super();
		this.bookingid = bookingid;
		this.seattypeid = seattypeid;
		this.noofseat = noofseat;
	}
	@Override
	public String toString() {
		return "BookingDetal [bookingid=" + bookingid + ", seattypeid=" + seattypeid + ", noofseat=" + noofseat + "]";
	}
	




}
