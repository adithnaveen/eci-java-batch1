package com.eci.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// with type safe 
public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(10);

		System.out.println("Before adding " + list.size());
		list.add("Harsha");
		list.add("Asha");
		list.add("Mahesh");
		list.add(1, "Avinash");
		System.out.println("After adding " + list.size());
		System.out.println(list);
		
		for(String temp : list){
			System.out.println(temp.toUpperCase());
		}
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
	}
}
