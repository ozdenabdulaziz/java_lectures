package day22_JavaRecap;

import java.util.Scanner;

public class minimum_number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*

         */

        int min = 2147483647;
        //  user is most likely to enter a number that's smaller than 2137483647

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();     // 1--, 200, 50, 300, 40
            if(n < min){
                min = n;
            }
        }
        scan.close();

        System.out.println("min = " + min);

    }
}
