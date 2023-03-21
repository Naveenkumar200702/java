package com.flightticketreservation.dto;

public class FlightInfo {

	private int flightId;
	private String flightName;
	private int totalSeat;
	private int economySeat;
	private int businessSeat;
	private int takkal;
	private String depature;
	private String destination;
	private boolean[][] seatArange;
	private double businessRate;
	private double economyRate;
	private double takkalRate;

	public FlightInfo(int flightId, String flightName,String depature,String distination,double economyRate,double businessRate) {
		this.flightId = flightId;
		this.flightName = flightName;
		this.totalSeat = 90;
		this.economySeat = 40;
		this.businessSeat = 20;
		this.takkal = 30;
		this.businessRate=businessRate;
		this.economyRate=economyRate;
		this.depature=depature;
		this.destination=distination;
		this.seatArange=new boolean[10][9];
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public int getEconomySeat() {
		return economySeat;
	}

	public void setEconomySeat(int economySeat) {
		this.economySeat = economySeat;
	}

	public int getBusinessSeat() {
		return businessSeat;
	}

	public void setBusinessSeat(int businessSeat) {
		this.businessSeat = businessSeat;
	}

	public int getTakkal() {
		return takkal;
	}

	public void setTakkal(int takkal) {
		this.takkal = takkal;
	}

	public String getDepature() {
		return depature;
	}

	public void setDepature(String depature) {
		this.depature = depature;
	}

	public double getBusinessRate() {
		return businessRate;
	}

	public double getEconomyRate() {
		return economyRate;
	}

}
