package coditas;

public class Developer extends Employee{
	int overtimehours = 2;
	double baseSalary;
	
	Developer(double baseSalary){
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double calculateGrossSalary(double baseSalary) {
		double grossSalary = baseSalary + (overtimehours * 500);
		return grossSalary;
	}
	
}
