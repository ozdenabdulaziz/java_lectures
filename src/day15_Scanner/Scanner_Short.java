package day15_Scanner;

import java.util.Scanner;

//  import java.util.*  -->     you can use this way but scanner is better this one.

public class Scanner_Short {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a short number: ");

        short s = scan.nextShort();
        System.out.println("Number is: " + s);

        System.out.println(scan.nextShort());   // nothing ask user but user can enter a number and print it number



    }
}
