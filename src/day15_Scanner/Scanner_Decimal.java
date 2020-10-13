package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Float number: ");
        float floatNumber = scan.nextFloat();
        System.out.println("Float number is: " + floatNumber);

        System.out.println("Enter a Double number: ");
        double doubleNumber = scan.nextDouble();
        System.out.println("Double number is: " + doubleNumber);

        System.out.println(scan.nextFloat() + scan.nextDouble());   // this lane will ask you a number for two times and printed addition both number

    }

}
