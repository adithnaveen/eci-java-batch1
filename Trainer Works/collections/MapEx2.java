package com.eci.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		// Map<String, String[]> map = new HashMap<String, String[]>();
		Map<String, List<String>> map = new HashMap<String,  List<String>>();
		map.put("hi", Arrays.asList(new String[]{"hi", "hello", "namaste", "namaskara"}));
		map.put("goodmorning",  Arrays.asList(new String[]{"good Morning", "Shuhodaya", "Bonjour"}));
		
		
//		Set<Map.Entry<String, List<String>>> set = map.entrySet();
//		
//		Iterator<Map.Entry<String, List<String>>> itr = set.iterator();
//		
//		while(itr.hasNext()){
//			Map.Entry<String, List<String>> temp = itr.next();
//			
//			System.out.println("Key " + temp.getKey());
//			System.out.println("Value " + temp.getValue());
//		}
		
		
		
		Set  set = map.entrySet();
		Iterator  itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, List<String>> temp = (Entry<String, List<String>>) itr.next();
			
			System.out.println("Key " + temp.getKey());
			for(String tmp : temp.getValue()){
				System.out.println(tmp);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
