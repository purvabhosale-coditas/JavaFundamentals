package coditas;

public class Manager extends Employee{
	int teamSize = 50;
	
	Manager(){
	}

	@Override
	public double calculateGrossSalary(double baseSalary) {
		double grossSalary = baseSalary + (teamSize * 1000);
		return grossSalary;
	}


}
