package com.eci.inheritance;

public class Jeep extends FourWheeler {

	public Jeep(int wheels){
		super(wheels);
	}

	public void offRoad(){
		System.out.println("jeep is good for Off Road...");
	}

	@Override
	public void move() {
		System.out.println("The Jeep Moves with " + getWheels() +" wheels");
	}
}
