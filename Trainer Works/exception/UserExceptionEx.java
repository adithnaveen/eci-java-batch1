package com.eci.exception;



class ECIException extends Exception{
	private String  msg;
	
	ECIException(){
		this.msg = "ECI Exception Thrown";
	}
	
	ECIException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ECIException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return ":::::::::: " + this.msg +"::::::::::";
	}
}

class ProBitsException extends Exception{
	String msg; 
	ProBitsException(){
		this.msg = "ProBits Exception Thrown";
	}
	
	ProBitsException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ProBitsException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return ":::::::::" + this.msg +":::::::::::";
	}
}

class IncomeTaxDept{
	public static void checkTax(String companyName, int sal, String name) 
				throws ECIException, ProBitsException, Exception{
		
		
		if(companyName.equalsIgnoreCase("eci") && sal < 30000){
			throw new ECIException("You Claim Less Salary of " + sal +" by " + name);
		}else if(companyName.equalsIgnoreCase("probits") && sal < 35000){
			throw new ProBitsException("You Claim Less Salary of " + sal +" by " + name);
		}else if(sal< 20000){
			throw new Exception("Sorry copmany name not listed pls check with IT "
						+ companyName +", " + name +", " + sal);
		}
		else{
			System.out.println("your income tax is getting processed Mr/Ms/Mrs/Dr " + name +"of Salary " + sal);
		}
	}
}


public class UserExceptionEx {
	public static void main(String[] args) {
		try {
			IncomeTaxDept.checkTax("eci", 20000, "Harish");
		} catch (ECIException e) {
			e.printStackTrace();
		} catch (ProBitsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

















