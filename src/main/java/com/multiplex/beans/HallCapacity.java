package com.multiplex.beans;

public class HallCapacity {
	private int HallId;
	private int SeatTypeId;
	private int SeatCount ;
	private SeatType seatType;
	public int getHallId() {
		return HallId;
	}
	public void setHallId(int hallId) {
		HallId = hallId;
	}
	public int getSeatTypeId() {
		return SeatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		SeatTypeId = seatTypeId;
	}
	public int getSeatCount() {
		return SeatCount;
	}
	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public HallCapacity(int hallId, int seatTypeId, int seatCount, SeatType seatType) {
		super();
		HallId = hallId;
		SeatTypeId = seatTypeId;
		SeatCount = seatCount;
		this.seatType = seatType;
	}
	public HallCapacity() {
		super();
	}
	
	
	
}
	
	
	