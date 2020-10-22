package day20_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = scan.nextInt();   //100
        scan.close();

        int result = 0;

        if (num >= 1) {

            for (int i = 1; i <= num; i++) { // used for calculating the sum and add them intro result:
                result += i;
            }
            System.out.println("Result: " + result);

        } else {
            System.out.println("Invalid Entry");
        }

    }
}

/*
        write a program that can calculate the sum of all numbers between 1 to any given number
	        ex:
	            input: 100
	            output: 5050

	            input: 50
	            output: 1275

 */