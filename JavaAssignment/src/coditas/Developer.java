package coditas;

public class Developer extends Employee{
	int overtimehours = 5;
	
	Developer(){
	}
	
	@Override
	public double calculateGrossSalary(double baseSalary) {
		double grossSalary = baseSalary + (overtimehours * 500);
		return grossSalary;
	}
	
}
