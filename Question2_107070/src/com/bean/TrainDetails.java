package com.bean;

public class TrainDetails {

	private int tno;
	private String name;
	private String source;
	private String destination;
	private double fare;

	public TrainDetails() {
		super();
	}

	public TrainDetails(int tno, String name, String source, String destination, double fare) {
		super();
		this.tno = tno;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "TrainDetails [tno=" + tno + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", fare=" + fare + "]";
	}

}
