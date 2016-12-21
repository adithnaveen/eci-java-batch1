package com.eci.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<String> vList = new Vector<String>(5, 3);
		
		System.out.println("initial Size " + vList.size());
		System.out.println("initial Capacity " + vList.capacity());
		
		vList.add("one");
		vList.add("two");
		vList.add("three");
		vList.add("four");
		vList.add("five");	
		vList.add("one");
		vList.add("two");
		vList.add("three");
		vList.add("four");
		vList.add("five");

		
		vList.add("one");
		vList.add("one");

		
		System.out.println("after store Size " + vList.size());
		System.out.println("after store  Capacity " + vList.capacity());
		
		
		
		Queue<String> q = new LinkedList<String>();
		
		
		q.offer("hello");
		q.offer("how");
		q.offer("are");
		q.offer("you");
		
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
