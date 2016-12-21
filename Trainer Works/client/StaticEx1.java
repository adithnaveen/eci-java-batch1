package com.eci.client;


// static methods are loaded first (before main since they are in stack)
// static blocks are executed first 
// static variables are available first 
public class StaticEx1 {
	static int x ;
	static int y;
	public static int add(int a, int b){
		return a + b;
	}
	
	public static void sayHi(){
		y = y + 4000;
		System.out.println("hi from SayHi Method " + y);
//		main(new String[]{"hello"});
	}
	
	static{
		System.out.println("Hi I'm from first Static block ");
	}
	
	static{
		System.out.println("Hi i'm second Static block ");
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		sayHi();
		System.out.println("y Value is " + y);
	}
	
	public static void sayHello(){
		System.out.println("hello from Hello");
	}
	
	static{
		System.out.println("hey i'm from third static block... ");
		y = 3333;
	}
}
