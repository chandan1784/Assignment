package com.mupack.demo;


public class Cars  {

	private int manuYear;
	private String carName;
	public int getManuYear() {
		return manuYear;
	}
	public void setManuYear(int manuYear) {
		this.manuYear = manuYear;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Cars(int manuYear, String carName) {
		super();
		this.manuYear = manuYear;
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Cars [manuYear=" + manuYear + ", carName=" + carName + "]";
	}
	
	public void ShowCarDetails() {		
		
		System.out.println("manuYear= "+manuYear+",carName= "+carName );
	}
	
	
	public Cars(){}
	
	
	}
	
	

	
	

