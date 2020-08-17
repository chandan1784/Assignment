package com.mupack.demo;

import java.util.List;



public class Showroom {
	
	private String name;
	private int showroomId;
	
	
	List<Cars> cars;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getShowroomId() {
		return showroomId;
	}


	public void setShowroomId(int showroomId) {
		this.showroomId = showroomId;
	}


	public List<Cars> getCars() {
		return cars;
	}


	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	

	public Showroom(String name, int showroomId, List<Cars> cars) {
		super();
		this.name = name;
		this.showroomId = showroomId;
		this.cars = cars;
	}


	@Override
	public String toString() {
		return "Showroom [name=" + name + ", showroomId=" + showroomId + ", cars=" + cars + "]";
	}

	public Showroom() {

	}

	
	

}
