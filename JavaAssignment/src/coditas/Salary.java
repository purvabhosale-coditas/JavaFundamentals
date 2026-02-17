package coditas;

public interface Salary {
	double pfpercent = 0.12;
	
	double calculateGrossSalary(double baseSalary);
	
	double calculateNetSalary(double grossSalary,double Bonus,double taxrate, double pf, double attendanceDeduction );
	
	double attendance(double baseSalary, int attendanceDays);
	
	double performanceBonusCalculation(double grossSalary, int rating);
	
	double taxCalculation(double grossSalary, double bonus);
	
	double pfdeduction(double baseSalary);
}
