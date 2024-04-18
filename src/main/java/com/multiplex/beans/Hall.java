package com.multiplex.beans;

public class Hall {
	
	private int hallId;
	private String hallName;
	private int hallCapacity;
	
	public Hall(int hallId, String hallName, int hallCapacity) {
		super();
		this.hallId = hallId;
		this.hallName = hallName;
		this.hallCapacity = hallCapacity;
	}

	public Hall() {
		super();
	}

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getHallCapacity() {
		return hallCapacity;
	}

	public void setHallCapacity(int hallCapacity) {
		this.hallCapacity = hallCapacity;
	}
	
}
