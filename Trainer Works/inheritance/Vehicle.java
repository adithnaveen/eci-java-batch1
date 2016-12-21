package com.eci.inheritance;

public abstract class Vehicle {
	
	private int wheels;
	
	public Vehicle(){}
	public Vehicle(int wheels){
		System.out.println("In Vehicle Constructor ");
		this.wheels = wheels;
	}
	
	// access-specifier access-modifier return-type method-name
	public  abstract void move();
	
	public void wheels(){
		System.out.println("All Vehicles will have wheels " + wheels );
	}
	public int getWheels() {
		return wheels;
	}
	
}
