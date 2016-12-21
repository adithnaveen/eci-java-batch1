package com.eci.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		map.put("Ravi", 40000);
		map.put("Ravi", 45454);
		map.put("Avinash", 45000);
		map.put("Chirag", 46000);
		
		System.out.println(map);
		System.out.println("Ravi Balance is " + map.get("Ravi"));
	}
}
