package com.eci.threads;

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread Name " + Thread.currentThread().getName());
		System.out.println("Thread Priority " + Thread.currentThread().getPriority());

		System.out.println("Thread object " + Thread.currentThread());
		System.out.println("Min Priority " + Thread.MIN_PRIORITY);
		System.out.println("Max Priority " + Thread.MAX_PRIORITY);
		System.out.println("Norm Priority " + Thread.NORM_PRIORITY);
	}
}
