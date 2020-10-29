package day24_NestedLoop;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("Enter a number: ");
            int n1 = scan.nextInt();

            System.out.println("Enter a number: ");
            int n2 = scan.nextInt();

            result = n1 + n2;

            scan.nextLine();    // before scan.nextLine we have int variables.
            System.out.println("Would you like to continue?");
            String a = scan.nextLine().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {     // while the answer is invalid (yes, or no )
                System.out.println("Invalid you like to, please Re-Enter");
                System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }

        System.out.println("result = " + result);


    }
}
/*
                1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */