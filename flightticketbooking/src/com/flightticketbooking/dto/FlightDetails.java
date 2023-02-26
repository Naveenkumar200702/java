package com.flightticketbooking.dto;

public class FlightDetails {
	private int flightId;
	private String flightName;
	private int totalSeat;
	private int availableSeat;
	private String pickUpPoint;
	private String destinationPoint;
	private int currentRegistration;
	private double price;

	public FlightDetails(int id, String name, int totalSeat, int availableSeat, String pickUpPoint, String destination,
			int currentRegistration,double price) {

		this.flightId = id;
		this.flightName = name;
		this.totalSeat = totalSeat;
		this.availableSeat = availableSeat;
		this.pickUpPoint = pickUpPoint;
		this.destinationPoint = destination;
		this.currentRegistration = currentRegistration;
		this.price=price;

	}

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

	public String getPickUpPoint() {
		return pickUpPoint;
	}

	public void setPickUpPoint(String pickUpPoint) {
		this.pickUpPoint = pickUpPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getCurrentRegistration() {
		return currentRegistration;
	}

	public void setCurrentRegistration(int currentRegistration) {
		this.currentRegistration = currentRegistration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
