package day16_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      // make the scanner object

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();            // accepting the first number

        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();            // accepting the second number

        System.out.println("Enter the Operator: ");
        String operator = scan.next();              // accepting the operation

        scan.close();                               // closing the Scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case "plus":
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "x":
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                isValid = false;
        }

        if(isValid) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else {
            System.out.println(operator + " is an invalid operator");
        }
    }
}

/*
Create a dynamic calculator

		ask user to enter two numbers and operator

		ex:
			enter number 1
			5
			enter number 2
			10
			enter operator

			output = 5 + 10 =15
 */