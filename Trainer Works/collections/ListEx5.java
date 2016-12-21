package com.eci.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void show(List<? extends Number> list){
//		list.remove(0);
		
		
//		list.add(44);
		
		for(Number temp : list){
			System.out.println(temp);
		}
	}
	
	
	

	public static void show2(List<? extends Object> list){
		for(Object temp : list){
			System.out.println(temp);
		}
	}
	
	public static void show1(List<? super Number> list){
		for(Object temp : list){
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<Integer>();
		List<Double > listDouble = new ArrayList<Double>();
		
		
		listInt.add(100);
		listInt.add(200);
		listInt.add(300);
		listInt.add(400);
		
		show2(listInt);
		
		listDouble.add(10.4);
		listDouble.add(102.4);
		listDouble.add(104.7);
		listDouble.add(13.7);
		
		System.out.println("-------------------------------------");
		show(listDouble);
		
		
		List<Object> strList = new ArrayList<Object>();
		strList.add("hi");
		
		show1(strList);
		
	}
	
	
}
