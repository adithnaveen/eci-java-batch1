package com.eci.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(34.4);
		
//		ArrayList<Integer> intList = list;
//		
//		for(Integer temp : intList){
//			System.out.println(temp);
//		}
		
		
		ArrayList<Number> intList = list;
		
		for(Number temp : intList){
			System.out.println(temp);
		}
		
		
		List<Integer> iList = new ArrayList<Integer>();
		
		// invalid 
		// List<Number> iiList = new ArrayList<Integer>();

		// no polymorphic behviour so no instanceOf
//		System.out.println(iList instanceof ArrayList<Integer>);
		
		
		ArrayList<?> lista ;
		ArrayList<Object> listb = new ArrayList<Object>();
		lista = listb;
		
//		lista.add("hi");
//		lista.add(33);
//		
		ArrayList listc;
		
		
		
		
		
		
		
		
	}
}
