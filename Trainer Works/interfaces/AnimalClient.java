package com.eci.interfaces;

public class AnimalClient {

	public static void showAnimal(IAnimal [] animals){
		for(IAnimal temp : animals){
			System.out.println("---------------------------------");
			temp.talk();
			temp.walk();
			temp.shout();
			if(temp instanceof Human){
				((Human) temp).dressCode();
			}
		}
	}
	
	public static void main(String[] args) {
		IAnimal animals[] = new IAnimal[4];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Human();
		animals[3] = new Tiger();
		
		showAnimal(animals);
		
	}
}
