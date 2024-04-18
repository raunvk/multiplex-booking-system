package com.multiplex.beans;

public class ShowUsers {
	private int showId;
	private String hall;
	private String mname;
	private int slotId;
	private String seatType;
	private int totalSeat;
	private int seatAvailable;
	private float price;
	private String fromdate;
	private String todate;
	private String link;
	private int mid;
	private int hallid;
	private int seatid;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getHall() {
		return hall;
	}
	public void setHall(String hall) {
		this.hall = hall;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public int getSeatAvailable() {
		return seatAvailable;
	}
	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getHallid() {
		return hallid;
	}
	public void setHallid(int hallid) {
		this.hallid = hallid;
	}
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	public ShowUsers(int showId, String hall, String mname, int slotId, String seatType, int totalSeat,
			int seatAvailable, float price, String fromdate, String todate, String link, int mid, int hallid,
			int seatid) {
		super();
		this.showId = showId;
		this.hall = hall;
		this.mname = mname;
		this.slotId = slotId;
		this.seatType = seatType;
		this.totalSeat = totalSeat;
		this.seatAvailable = seatAvailable;
		this.price = price;
		this.fromdate = fromdate;
		this.todate = todate;
		this.link = link;
		this.mid = mid;
		this.hallid = hallid;
		this.seatid = seatid;
	}
	@Override
	public String toString() {
		return "ShowUser [showId=" + showId + ", hall=" + hall + ", mname=" + mname + ", slotId=" + slotId
				+ ", seatType=" + seatType + ", totalSeat=" + totalSeat + ", seatAvailable=" + seatAvailable
				+ ", price=" + price + ", fromdate=" + fromdate + ", todate=" + todate + ", link=" + link + ", mid="
				+ mid + ", hallid=" + hallid + ", seatid=" + seatid + "]";
	}
	
	

}
