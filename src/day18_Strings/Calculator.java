package day18_Strings;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number: ");
        double n1 = scan.nextDouble();
        System.out.println("enter math operator: "); // +, -, *, /, %
        char operator = scan.next().charAt(0);

        System.out.println("enter a second number");
        double n2 = scan.nextDouble();

        boolean isValid = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';

        if(isValid){
            if(operator == '*'){
                System.out.println("Multiplication: " + n1 * n2);
            }else if(operator == '/'){
                System.out.println("Division: " + n1 / n2);
            }else if(operator == '+'){
                System.out.println("Addition: " + n1 + n2);
            }else if(operator == '-'){
                System.out.println("Subtraction: " + (n1 - n2));
            }else{
                System.out.println("Remainder: " + n1 % n2);
            }

        }else{
            System.err.println("Invalid operator is entered");
        }


    }
}
