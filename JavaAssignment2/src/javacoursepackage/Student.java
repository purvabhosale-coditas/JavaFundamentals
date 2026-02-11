package javacoursepackage;


public class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}
	
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
		
	}
	
}
