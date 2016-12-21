package com.eci.clone;

public class LaptopClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Laptop l1 = new Laptop(101, "Apple");
		
		System.out.println(l1.getLaptopId() +", " + l1.getLaptopName() +", " + l1.hashCode());
		
		Laptop l2 = (Laptop) l1.clone();
		
		System.out.println(l2.getLaptopId() +", " + l2.getLaptopName()+", " + l1.hashCode());
		l2.setLaptopName("Mac Book Air");
		
		
		System.out.println("L1 " +l1.getLaptopId() +", " + l1.getLaptopName()+", " + l1.hashCode());
		System.out.println("L2 " +l2.getLaptopId() +", " + l2.getLaptopName()+", " + l1.hashCode());
		
		
		Laptop lNew = new Laptop(33, "Toshiba");
		System.out.println("LNEw " + lNew.getLaptopId() +", " + lNew.getLaptopName() +", " + lNew.hashCode());
	}
}
