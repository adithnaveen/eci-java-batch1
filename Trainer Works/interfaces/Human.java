package com.eci.interfaces;

public class Human implements IAnimal, Work {

	@Override
	public void talk() {
		System.out.println("Human talk with a language and accent... ");
	}

	@Override
	public void walk() {
		System.out.println("Human Walk with 2 legs");
	}

	@Override
	public void shout() {
		System.out.println("Human shouts zzzzzzzzzzzz.... ");
	}

	@Override
	public void dressCode() {
		System.out.println("Mon - Thu (Formals) and Fri - Casuals");
	}

	public void something(){}
	
}
