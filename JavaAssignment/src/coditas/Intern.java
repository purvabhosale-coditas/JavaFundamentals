package coditas;

public class Intern extends Employee{
	int attendanceDays;
	double baseSalary;

	
	Intern(double baseSalary,int attendanceDays){
		this.baseSalary = baseSalary;
		this.attendanceDays = attendanceDays;
	}
	
	@Override
	public double calculateGrossSalary(double baseSalary) {
		double grossSalary;
		double attendancePercent = (attendanceDays / 30) * 100;
		if(attendancePercent<0.70) {
			grossSalary = baseSalary - (baseSalary * 0.20);
		}
		else {
			grossSalary = baseSalary;
		}
		return grossSalary;
	}


}


