package com.flightticketbooking.dto;

public class BookingDetails {
	private int flightId;
	private int ticketId;
	private String bookingId;
	private String name;
	private int age;
	private long aadharNo;
	public BookingDetails(String bookingid,int flightId,int ticketId,String name,int passengerAge,long aadharNo)
	{
		this.bookingId=bookingId;
		this.flightId=flightId;
		this.ticketId=ticketId;
		this.name=name;
		this.age=passengerAge;
		this.aadharNo=aadharNo;
	}
	public long getaadhatNo() {
		return aadharNo;
	}
	
	public int getFlightId() {
		return flightId;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	
	public String getBookingId() {
		return bookingId;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setaadharNo(int aadharNo) {
		this.aadharNo=aadharNo;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
}
