package day22_JavaRecap;

import java.util.Scanner;

public class maximum_number {

    public static void main(String[] args) {

        /*
                Scanner object: 1
                max : 1

                "enter a number" : 5
                nextInt(): 5

                "maximum number is..." : 1
             */

        Scanner scan = new Scanner(System.in);
        int max = -99999999;
        // user most likely to enter a number thats greater than -999999

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt(); //  -1, 3, 4, 5;

            if (n > max) {
                max = n;
            }
        }
        scan.close();
        System.out.println("max = " + max);


    }
}
