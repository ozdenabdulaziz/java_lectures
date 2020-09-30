package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // salary: 100000;
        // taxRate: 0.28;

        int salary = 100000;
        double taxRate = 0.28;

        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your total tax will be: ");
        System.out.println(totalTax);

        System.out.println("Your salary after tax: ");
        System.out.print("$ ");
        System.out.println(salaryAfterTax);





    }


}


/*
       Task04: SalaryCalculator
	write a program that can calculate the salary after based on the salary and tax rate
			Ex:
				if salary = 100000
					taxrate = 0.28

					totalTax = salary * taxRate;

					salary after tax = salary - totalTax

 */