package day22_JavaRecap;

import java.util.Scanner;

public class string_practice_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lName = scan.nextLine();
        scan.close();

        String initial = fName.substring(0,1).toUpperCase() + "." +lName.substring(0,1).toUpperCase();

        System.out.println("initial = " + initial);

    }
}
