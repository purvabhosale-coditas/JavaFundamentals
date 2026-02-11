package javacoursepackage;

import java.util.ArrayList;
import java.util.Collections;

public class Program10 {

	public static void main(String[] args) {
		
		Student student1 = new Student(2,"Purva", 80);
		Student student2 = new Student(1,"Ayush", 70);
		Student student3 = new Student(3,"Nandini", 90);
		
		ArrayList<Student> stuobjs = new ArrayList<>();
		
		stuobjs.add(student1);
		stuobjs.add(student2);
		stuobjs.add(student3);
		
		System.out.println("Students before sorting:");
		for(Student s : stuobjs) {
			System.out.println(s);
		}
		
		System.out.println("\nStudents sorted by id using Comparable:");
		Collections.sort(stuobjs);
		
		for(Student s : stuobjs) {
			System.out.println(s);
		}
		
//		System.out.println("\nStudents sorted by id using Comparator:");
//		Collections.sort(stuobjs, new StudentwithComparator());
//		
//		for(Student s : stuobjs) {
//			System.out.println(s);
//		}
		
		System.out.println("\nStudents sorted by name using Comparator:");
		Collections.sort(stuobjs, new StudentwithComparator());
		
		for(Student s : stuobjs) {
			System.out.println(s);
		}
		

	}


}
