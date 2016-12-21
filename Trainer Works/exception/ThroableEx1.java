package com.eci.exception;

public class ThroableEx1 {
	
	public static void test(String str) throws Throwable{
		if(str.equals("hello")){
			System.out.println("Welcome ");
		}else{
			throw new Exception("You have to say me Hello");
		}
	}
	
	public static void main(String[] args) {
		try {
			test("hi");
		} catch (Throwable e) {
				StackTraceElement [] elements = e.getStackTrace();
				
				for(StackTraceElement temp : elements){
					System.out.println("[Class Name : " +temp.getClassName() + 
												",File Name " + temp.getFileName()+ 
												",Method Name " + temp.getMethodName() + 
												",Line Number " + temp.getLineNumber() +"]");
				}
				
		}
	}
}
