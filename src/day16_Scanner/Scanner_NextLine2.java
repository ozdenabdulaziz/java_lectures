package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scan.nextLong();

        scan.nextLine();    // the purpose of this is to accept the enter key.

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Name: " + fullName + "\n" + "Age: " + age );
        System.out.println("Phone number: " + phoneNumber);



    }
}
