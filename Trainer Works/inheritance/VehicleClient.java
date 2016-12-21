package com.eci.inheritance;

public class VehicleClient {
	
	public static void showVehicle(Vehicle [] vehicles){
		for(Vehicle temp : vehicles){
			System.out.println("--------------------------");
			temp.move();
			temp.wheels();
			((FourWheeler)temp).steering();
			
			if(temp instanceof Car){
				((Car) temp).getDoors();
			}else if(temp instanceof Jeep){
				((Jeep) temp).offRoad();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Vehicle vehicles[] = new Vehicle[4];
		
		
		vehicles[0] = new  Car(2, 4);
		vehicles[1] = new  Jeep(4);
		vehicles[2] = new  Car(4, 4);
		vehicles[3] = new  Jeep(5);
		
		showVehicle(vehicles);
	}
}
