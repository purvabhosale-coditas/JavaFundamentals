package javacoursepackage;

import java.util.Comparator;

public class StudentwithComparator implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
//	public int compare(Student s1, Student s2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(s1.id, s2.id);
//	}
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
