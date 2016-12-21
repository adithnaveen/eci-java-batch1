package com.eci.inheritance;



class   Parent{
	String name;
	String code;
	final int x=100;
	static{
		System.out.println("Static In Parent Called...");
	}
	
	{
		System.out.println("Instance in Parent Called... ");
	}
	
	Parent(String name){
		this.name = name;
		System.out.println("Constructor in Parent Called... ");
	}
	
	public final void hi(){}

	Parent(){
		System.out.println("Constructor in Parent Called... ");
	}
}

class Child extends Parent{
	
//	public void hi(){}
	static{
		System.out.println("Static in Child Called...");
	}
	{
		System.out.println("Instance in Child Called... ");
	}
	
	Child(String name){
		super(name);
		System.out.println("Constructor in Child Called... ");
	}
}







public class InheEx1 {
	public static void main(String[] args) {
		Child child = new Child("Harsha");
		System.out.println("----------------------------------");
		Child child1 = new Child("Harish");
	}
}








