package day16_Scanner;

import java.util.*; // it's accept all package

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your address: ");
        String address = scan.nextLine();   //nextLine(); accept all words and number in same line.

        System.out.println("Address: " + address);




    }

}
