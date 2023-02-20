package com.flighticketbooking.dto;

public class flightDetails {
	private int flightId;
	private String flightName;
	private int totalSeat;
	private int availableSeat;
	private String journeyStart;
	private String destination;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}

	public String getJourneyStart() {
		return journeyStart;
	}

	public void setJourneyStart(String journeyStart) {
		this.journeyStart = journeyStart;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
