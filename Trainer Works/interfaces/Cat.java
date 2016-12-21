package com.eci.interfaces;

public abstract class Cat implements IAnimal {

	@Override
	public void walk() {
		System.out.println("Cat Walks with 2 legs, 2 limbs");
	}
	
}
