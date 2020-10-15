package day16_Scanner;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next(); // we have only one word for that you can use next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        System.out.println("Are you employed? \'True or False\'");
        boolean isEmployed = scan.nextBoolean();

        double salary = 0;

        if(isEmployed == true){
            System.out.println("What is your salary? ");
            salary = scan.nextInt();
        }   // you don't need to use else statement it's not mandatory.

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary: " + salary);


    }
}

/*

ask the user to enter their first name. then ask the user to enter their last name. then ask the user if they are current;y employed.

		if the user is employed, also ask them what their salary is.

		Print all the information at the end:
				full name is:
				employed :
				salary:
 */