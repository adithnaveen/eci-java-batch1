package com.eci.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List<Number> nums = new ArrayList<Number>();
		
		nums.add(new Integer(23));
		nums.add(34.6);
		nums.add(110);
		
		double res =0;
		for(Number temp : nums){
			res = res +  temp.doubleValue();
		}
		System.out.println(res);
		
		
		ArrayList<Object> objList = new ArrayList<Object>();
		ArrayList genList = new ArrayList();
		
		
		
	}
}
