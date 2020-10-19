package day18_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubStringMethod {

    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789

        String day = str.substring(9, 14 + 1);

        System.out.println(day);

        System.out.println("\n-------------------------\t---------------------------\n");

        String email = "firstname@gmail.com";
        //          012345678
        String emailSub = email.substring(10, 14 + 1);

        System.out.println("Domain of the email: " + emailSub);

        System.out.println("\n-------------------------\t---------------------------\n");

        String s1 = "I like movies and books";
        //           01234567
        String word1 = s1.substring(7, 12 + 1);
        String word2 = s1.substring(17, 21 + 1);
        System.out.println(word1 + " and " + word2);

        System.out.println("\n-------------------------\t---------------------------\n");

        String firstName = "mArWaN";    // Marwan
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length() - 1 + 1).toLowerCase();


        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;

        System.out.println(firstName);

        System.out.println("\n-------------------------\t---------------------------\n");

        /*
        Ask the user to enter first and last names, then print out the full name
                input:
                        cYbErTeK
                        sCHOOL
                output:
                        Cybertek School
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String fName = scan.nextLine();
        fName = fName.substring(0, 1).toUpperCase() + fName.substring(1, fName.length() - 1 + 1).toLowerCase();

        System.out.println("Enter your last name: ");
        String lName = scan.nextLine();
        lName = lName.substring(0, 1).toUpperCase() + lName.substring(1, lName.length() - 1 + 1).toLowerCase();

        System.out.println("Your full name: " + fName + " " + lName);


    }
}
