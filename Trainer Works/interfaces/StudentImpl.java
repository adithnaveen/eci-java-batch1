package com.eci.interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentImpl {
	
	
	public static void show(Student [] students){
		for(Student temp : students){
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		Student [] students = new Student[5];
		
		students[0] = new Student(101, "Shradha", 66);
		students[1] = new Student(12, "Asha", 77);
		students[2] = new Student(67, "Navjot", 88);
		students[3] = new Student(11, "Pritham", 56);
		students[4] = new Student(44, "Peter", 33);
		
		show(students);
		
		Arrays.sort(students);
		System.out.println("------------------------------");
		show(students);
		System.out.println("------------------ no sid ascending -----------------");
		
		// Arrays.sort(students , new SortSorter());
		
		SortSorter.sortOnId(students);
		show(students);
		
		
		
		System.out.println("--------------- sname descending order ---------------");
		SortSorter.sortOnNameDesc(students);
		show(students);
		
		
		System.out.println("----------------- sort on marks ------------------ ");
		
		Arrays.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getMarks() - o2.getMarks();
			}
		});
		
		show(students);
		System.out.println("----------------- on sid ascending ----------------- ");

		Arrays.sort(students, ( s1 ,  s2 ) -> s1.getsId() - s2.getsId() );

		List<Student> list = Arrays.asList(students);
		
		list.forEach(System.out :: println);
	}
}




















