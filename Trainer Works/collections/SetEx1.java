package com.eci.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Amit");
		set.add("Asha");
		set.add("Ankit");
		set.add("Ankit");
		set.add("Ankit");
		set.add("Ankit");
		set.add("Ankit");
		set.add("Ankit");

		
		set.forEach(System.out :: println);
	}
}
