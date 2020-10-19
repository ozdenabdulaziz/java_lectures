package day18_Strings;

import java.util.Scanner;

public class SubStringMethod2 {

    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789

        String day = str.substring(9, str.length() - 1 + 1);
//        String day = str.substring(9);   ---> Monday

        System.out.println(day);

        System.out.println("\n-------------------------\t-------------------------\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();    // First name
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your full name: " + firstName + " " + lastName);

    }
}
