package com.eci.inheritance;

public abstract class FourWheeler extends Vehicle {
	public void steering(){
		System.out.println("Four Wheeler has steering");
	}
	
	public FourWheeler(int wheels) {
		super(wheels);
		System.out.println("In Four Wheeler Constructor ");
	}
	
}
