package javacoursepackage;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual salary: ");
        double salary = sc.nextDouble();

        System.out.println("Choose Tax Regime:");
        System.out.println("1. Old Tax Regime");
        System.out.println("2. New Tax Regime");
        int choice = sc.nextInt();

        double tax = 0;

//        if (choice == 1) {   // Old Tax Regime
//
//            if (salary <= 250000) {
//                tax = 0;
//            }
//            else if (salary>250000 && salary <= 500000) {
//                tax = salary * 0.05;
//            }
//            else if (salary>500000 && salary <= 1000000){
//                tax = salary* 0.20;
//            }
//            else {
//                tax = salary * 0.30;
//            }
//
//        }
//        else if (choice == 2) {   // New Tax Regime
//
//            if (salary <= 250000) {
//                tax = 0;
//            }
//            else if (salary>250000 && salary <= 500000) {
//                tax = salary * 0.05;
//            }
//            else if (salary>500000 && salary <= 750000) {
//                tax = salary * 0.10;
//            }
//            else if (salary>750000 && salary <= 1000000) {
//                tax = salary * 0.15;
//            }
//            else if (salary>1000000 && salary <= 1250000) {
//                tax = salary * 0.20;
//            }
//            else if (salary>1250000 && salary <= 1500000) {
//                tax = salary * 0.25;
//            }
//            else {
//                tax = salary * 0.30;
//            }
//
//        }
//        else {
//            System.out.println("Invalid Choice!");
//            return;
//        }
        
        switch (choice) {

        case 1:  
            if (salary <= 250000) {
                tax = 0;
            }
            else if (salary <= 500000) {
                tax = salary * 0.05;
            }
            else if (salary <= 1000000) {
                tax = salary * 0.20;
            }
            else {
                tax = salary * 0.30;
            }
            break;

        case 2:   
            if (salary <= 250000) {
                tax = 0;
            }
            else if (salary <= 500000) {
                tax = salary * 0.05;
            }
            else if (salary <= 750000) {
                tax = salary * 0.10;
            }
            else if (salary <= 1000000) {
                tax = salary * 0.15;
            }
            else if (salary <= 1250000) {
                tax = salary * 0.20;
            }
            else if (salary <= 1500000) {
                tax = salary * 0.25;
            }
            else {
                tax = salary * 0.30;
            }
            break;

        default:
            System.out.println("Invalid Choice!");
        }

        System.out.println("Total Tax Payable: Rs." + tax);

	}

}
