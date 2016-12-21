package com.eci.interfaces;

import java.util.Arrays;
import java.util.Comparator;

/*public class SortSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getsId() - o2.getsId();
	}

}
*/


public class SortSorter{


		public static Student[] sortOnId(Student [] students){
			class SortOnId implements Comparator<Student>{
				@Override
				public int compare(Student o1, Student o2) {
					return o1.getsId() - o2.getsId();
				}
			}
			
			Arrays.sort(students, new SortOnId());
			return students;
		}

		
		
		

		// local class 
		public static Student[] sortOnNameDesc(Student [] students){
			class SortOnNameDesc implements Comparator<Student>{
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getName().compareTo(o1.getName());
				}
			}
			
			Arrays.sort(students, new SortOnNameDesc());
			return students;
		}

		
		// Anonymous class
		public static Student[] sortOnName(Student[] students){
			Arrays.sort(students, new Comparator<Student>(){

				@Override
				public int compare(Student o1, Student o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			});
			
			return students;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
