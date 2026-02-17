package coditas;

public abstract class Employee implements Salary{
	
	@Override
	public abstract double calculateGrossSalary(double baseSalary);
	
	@Override
	public double calculateNetSalary(double grossSalary,double bonus,double taxrate, double pf, double attendanceDeduction ) {
		double netSalary = grossSalary + bonus - taxrate - pf - attendanceDeduction;
		return netSalary;
	}
	
	@Override
	public double pfdeduction(double baseSalary) {
		double pf = baseSalary * pfpercent;
		return pf;
	}
	
	@Override
	public double attendance(double baseSalary, int attendanceDays) {
		double dailySalary = baseSalary / 30;
		int absentDays = 30 - attendanceDays;
		double attendanceDeduction = absentDays * dailySalary;
		return attendanceDeduction;
		
	}
	
	@Override
	public double performanceBonusCalculation(double grossSalary, int rating) {
		double bonusPercent = 0.0;
		if(rating<=5) {
			if(rating == 5) {
				bonusPercent = 0.20;
			}
			else if (rating == 4) {
				bonusPercent = 0.15;
			}
			else if (rating == 3) {
				bonusPercent = 0.10;
			}
			else if (rating == 2) {
				bonusPercent = 0.05;
			}
			else {
				bonusPercent = 0.0;
			}
		}
		else {
			System.out.println("Invalid rating");
		}
		
		double bonus = grossSalary * bonusPercent;
		return bonus;	
	}
	
	@Override
	public double taxCalculation(double grossSalary, double bonus) {
		double taxrate;
		double taxableIncome = grossSalary + bonus;
		if(taxableIncome <= 50000) {
			taxrate = 0.05;
		}
		else if (taxableIncome>=50001 && taxableIncome<=100000) {
			taxrate = 0.10;
		}
		else if (taxableIncome>=100001 && taxableIncome<=150000) {
			taxrate = 0.15;
		}
		else {
			taxrate = 0.20;
		}
		double tax = taxableIncome * taxrate;
		return tax;
	}
}
