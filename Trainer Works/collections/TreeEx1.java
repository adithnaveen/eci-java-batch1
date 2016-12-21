package com.eci.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeEx1 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Mahesh");
		set.add("Harish");
		set.add("Manjunath");
		set.add("Manjunath1");
		set.add("Manjunath2");
		set.add("Manjunath3");
		
		
		System.out.println(set);
		NavigableSet<String> nSet = set.descendingSet();
		System.out.println(nSet);
		
//		NavigableSet<String> nSet1 = (NavigableSet<String>) set.headSet("Manjunath", true);
		NavigableSet<String> nSet1 = (NavigableSet<String>) set.tailSet("Manjunath");
		System.out.println(nSet1);
		
	}
}
