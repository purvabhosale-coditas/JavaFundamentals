package coditas;

public class Main {

	public static void main(String[] args) {
		double baseSalary = 2000;
		int attendanceDays = 22;
		int rating = 4;
		
		Employee d1 = new Intern(baseSalary,attendanceDays);
		
		System.out.println("Employee's Salary Calculation Module:");
		
		double grossSalary = d1.calculateGrossSalary(baseSalary);
		System.out.println("Gross Salary is: " + grossSalary);
		
		double attendanceDeduction = d1.attendance(baseSalary, attendanceDays);
		System.out.println("Attendance deduction is : " + attendanceDeduction);
		
		double pf = d1.pfdeduction(baseSalary);
		System.out.println("PF deduction is : " + pf);
		
		double bonus = d1.performanceBonusCalculation(grossSalary, rating);
		System.out.println("Performance Bonus is : " + bonus);
		
		double taxrate = d1.taxCalculation(grossSalary, bonus);
		System.out.println("Calculated Tax is : " + taxrate);
		
		System.out.println("Employee's Net Salary is: " + d1.calculateNetSalary(grossSalary,bonus,taxrate, pf,attendanceDeduction));

	}

}
