package com.eci.collections;

import java.util.ArrayList;
import java.util.List;


class Emp{}
// to show generic raw type
// <Object>
public class ListEx1 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		List list = new ArrayList();
		
		int x=33; 
		list.add("hi");
		list.add(x);
		list.add(44.5);
		list.add(true);
		list.add(new Object());
		list.add(new Emp());
		
		
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}
}
