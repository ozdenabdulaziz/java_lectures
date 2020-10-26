package day22_JavaRecap;

import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;
        int max = -2146483647;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if (n < min) { // if the input is smaller than previous min number
                min = n;
            }

            if (n > max) { // if the inputs is greater than previous max number
                max = n;
            }

        }

        scan.close();

        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }
}
