package coditas;

public class Manager extends Employee{
	int teamSize = 50;
	double baseSalary;
	
	Manager(double baseSalary){
		this.baseSalary = baseSalary;
	}

	@Override
	public double calculateGrossSalary(double baseSalary) {
		double grossSalary = baseSalary + (teamSize * 1000);
		return grossSalary;
	}


}
