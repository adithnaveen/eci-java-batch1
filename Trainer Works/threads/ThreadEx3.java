package com.eci.threads;


//
//@FunctionalInterface
//interface IHello{
//	void hi();
//}
//
//

class DoMyJob implements Runnable{
	Thread t;
	
	public DoMyJob(String name, int priority) {
		t = new Thread(this, name);
		t.setPriority(priority);
		
		// this statement will create an os level thread and invoke run() 
		t.start();
		
	}
	public DoMyJob(){}
	
	@Override
	public void run() {
			
		for(int i=0; i< 500; i++){
			System.out.println("i value " + i +" in " + Thread.currentThread().getName());
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() +" exiting... " );
	}
	
}



public class ThreadEx3 {
	public static void main(String[] args) {
		
		DoMyJob d1 = new DoMyJob("Shradha", 1);
		DoMyJob d2 = new DoMyJob("Abhishek", 2);
		DoMyJob d3 = new DoMyJob("Prasad", 10);
		
		
		
		Thread t1 = new Thread(new DoMyJob());
		t1.setName("Rucha");
		t1.setPriority(5);
		t1.start();
		
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0; i< 500; i++){
					System.out.println("i value " + i +" in " + Thread.currentThread().getName());
				}
				
			}
		});
		
		t2.setName("Mahesh");
		t2.start();
		
		
		// syntactically 1.8 jdk
		new Thread(()->{
			for(int i=0; i< 500; i++){
				System.out.println("i value " + i +" in " + Thread.currentThread().getName());
			}
		}).start();
		
		
		
		
	}
}






