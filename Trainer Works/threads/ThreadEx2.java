package com.eci.threads;



class MyBusiness extends Thread{

	@Override
	public void run() {
		// to simulate 
		for(int i=0;true;i++){
			System.out.println("i value " + i + " in " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		System.out.println("Thread " + Thread.currentThread().getName() +" Exiting... ");
	}
	
}


public class ThreadEx2 {
	public static void main(String[] args) {
		
		System.out.println("Start of Main");
		MyBusiness mb1 = new MyBusiness();
		MyBusiness mb2 = new MyBusiness();
		MyBusiness mb3 = new MyBusiness();
		
		
		mb1.start();
		mb2.start();
		mb3.start();
		
		try{
			mb1.join();
			mb2.join();
			mb3.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		System.out.println("End of Main... ");
	}
}
