package day06_AritmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.23;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;


        System.out.println("Your salary Tax is: $ " +salary);
        System.out.println("Your State Tax is: $ " +stateTax);
        System.out.println("Your Federal Tax is: $ " +federalTax);
        System.out.println("Your Total Tax is: $ " +totalTax);
        System.out.println("Your salary after Tax is: $ " +salaryAfterTax);






    }

}

/*

    Task02: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21

    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax


 */