package day16_Scanner;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a browser: ");
        String browser = scan.nextLine();

        scan.close();

        switch (browser) {
            case "firefox":     // LOWER CASE
            case"FIREFOX":      // UPPER CASE
            case "chrome":
            case "CHROME":
            case "safari":
            case "SAFARI":
            case "opera":
            case "OPERA":
                System.out.println("Browser_Type is Opening... " + browser);
                break;

            default:
                System.out.println("Browser_type is not a valid browser.");
        }


    }

}
/*
Task-1:

		Write a program that will ask the user to enter a browser type(firefox, chrome, safari, opera) handle case sensitivity

		if a valid browser type is entered print "Browser_Type is Opening..."

		if the given browser is not valid print "Browser_type is not a valid browser."
 */