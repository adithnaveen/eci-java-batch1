package com.eci.dp;




class Car{
	public static final int  MARUTI = 1;
	public static final int  AUDI = 2;
	public static final int  BMW = 3;
	
	 Car getCar(int carId){
		if(carId == 1){
			return new Maruti();
		}else if (carId == 2 ){
			return new Audi();
		}else if(carId ==3){
			return new BMW();
		}
	
	
		return null;
	}
	
	private class Maruti extends Car{}
	private class Audi extends Car{}
	private class BMW extends Car{}
}











































public class DP1 {
	public static void main(String[] args) {
		Car myCar = new Car().getCar(Car.MARUTI);
	}
}














