package com.eci.exception;

import java.io.IOException;

public class ExceptionEx2 {

	
	public static void checkName(String name){
		if(name.length() < 4){
			throw new RuntimeException("Sorry Name cannot be less than 4 chars");
		}
	}
	
	
	public static void checkSal(String name, int salHike) throws IOException{
		try{
			checkName(name);
	
		
		if(salHike < 5000){
			throw new IOException("Too Less Salary for " + name +" hike got is " + salHike);
		}else if(salHike > 5000 && salHike< 10000){
			throw new RuntimeException("I'm okay with hike buy why so less by " + name +" got is " +salHike);
		}else{
			System.out.println("i'm happy with hike " + salHike +" by " + name);
		}	
		
		}catch(RuntimeException re){
			throw new RuntimeException("Sorry You Job is Not Done", re);
		}
	}

	public static void main(String[] args) {
		try {
			checkSal("a", 4444);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(RuntimeException re){
			re.printStackTrace();
		}
		
		System.out.println("i'm still waiting... ");
	}
	
}















