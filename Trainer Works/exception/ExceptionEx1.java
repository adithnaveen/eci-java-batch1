package com.eci.exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
			
			// opening the connection 
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		// do processing 
			try{
				int [] nums = new int[-5];
			}catch(NegativeArraySizeException nase){
				System.out.println("Sorry dont initialize with -ve values ");
			}
			
		System.out.println("Division is " + (num1 / num2));
		
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(NumberFormatException nfe){
			System.out.println("Job Was not done becase " + nfe.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			// will 100 % exeucte 
			

			// close 
			System.out.println("I'm always there... ");
		}
		
		
		
		System.out.println("Hey i'm there some BL");
		try{
			
		}catch(Exception e ){}
		
		finally{
			System.out.println("i'm there from empty try");
			try{
				int x = 10/5;
			}catch(ArithmeticException ae){
				System.out.println(ae);
			}finally{
				System.out.println("i'm in arithmetic finally code ");
			}
		}
		
		
		
		System.out.println("i'm last guy");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
