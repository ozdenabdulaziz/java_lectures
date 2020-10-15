package day16_Scanner;

import java.util.Scanner;

public class Scanner_Close {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scan.nextInt();

        scan.close(); // After closing, we cannot use the Scanner again

        System.out.println(scan.next()); // This gives exception when running, because it closed


    }
}
