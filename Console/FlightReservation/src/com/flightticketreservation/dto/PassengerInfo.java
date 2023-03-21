package com.flightticketreservation.dto;

public class PassengerInfo {
	private String userName;
	private int ticketId;
	private String passengerName;
	private int age;
	private long aadharNo;
	private int flightId;
	private String seatPosition;
	
	public PassengerInfo(int flightId, String passengerName, int passengerAge, long aadharNo, String userName2, int ticketId2, String seatPosition) {
		this.passengerName=passengerName;
		this.flightId=flightId;
		this.age=passengerAge;
		this.aadharNo=aadharNo;
		this.userName=userName2;
		this.ticketId=ticketId2;
		this.seatPosition=seatPosition;
	}
	public String getUserName() {
		return userName;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	
	public int getFlightId() {
		return flightId;
	}
	
	public long getAadharNo() {
		return aadharNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	public String getSeatPosition() {
		return seatPosition;
	}
	public void setSeatPosition(String seatPosition) {
		this.seatPosition = seatPosition;
	}
}
