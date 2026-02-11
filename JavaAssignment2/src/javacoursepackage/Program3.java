package javacoursepackage;

abstract class Employee{
	 abstract void calculateSalary();
	 void displayDetails(){
		 System.out.println("Employee Salary Processing...");
	 }
}

class FullTimeEmployee extends Employee{

	void calculateSalary() {
			System.out.println("Full Time Employee");
	}
}

class PartTimeEmployee extends Employee{

	void calculateSalary() {
			System.out.println("Part Time Employee");
	}
	
}
public class Program3 {

	public static void main(String[] args) {
		int salary = 40000;
		Employee obj;
		if(salary>=3000) {
			obj = new FullTimeEmployee();
		}
		else {
			obj =new PartTimeEmployee();
		}
		
		obj.displayDetails();
		obj.calculateSalary();
	}

}
