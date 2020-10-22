package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i--) {

            if (i < 1) {
                break;  // exits the loop immedietly

            }

            System.out.println("Hello World");

        }

        System.out.println("\n----------------------------------------\t------------------------------\n");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i == 0; ) {

            System.out.println("Enter two numbers: ");

            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Enter math operator: ");
            char opertor = scan.next().charAt(0);

            switch (opertor) {
                case '*':
                    System.out.println(n1 + " " + opertor + " " + n2 + " = " + (n1 * n2));
                    break;

                case '/':
                    System.out.println(n1 + " " + opertor + " " + n2 + " = " + (n1 / n2));
                    break;

                case '+':
                    System.out.println(n1 + " " + opertor + " " + n2 + " = " + (n1 + n2));
                    break;

                case '-':
                    System.out.println(n1 + " " + opertor + " " + n2 + " = " + (n1 - n2));
                    break;

                case '%':
                    System.out.println(n1 + " " + opertor + " " + n2 + " = " + (n1 % n2));
                    break;

                default:
                    System.out.println("Invalid math operator");
            }


            System.out.println("Would you like continue? (yes or no)");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using our calculator.");
                break;
            }
        }


    }
}

/*
        1.  ask user to enter two numbers and then print thesum if those two numbers:
        2.  ask the user, would you lie to continue? yes, no
                if answer yes: repeat;
                if answer no: exit loop
 */