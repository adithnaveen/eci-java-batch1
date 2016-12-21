package com.eci.inheritance;

public class Car extends FourWheeler {
	private  int doors;
	
	public Car(int doors, int wheels){
		super(wheels);
		System.out.println("In Car Constructor ");
		this.doors = doors;
	}
	
	public void  getDoors(){
		System.out.println("You Car Has  " + doors +" door/s");
	}

	@Override
	public void move() {
		System.out.println("Now Car Moves with " + getWheels() +" wheels") ;
	}
	
	
}
