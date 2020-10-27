package day23_NestedLoop;

import java.util.Scanner;

/*
    username: cybertek
    password: cybertek12345

 */
public class credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scan.next();

        System.out.println("enter your password: ");
        String password = scan.next();

        if (username.equals("cybertek") && password.equals("cybertek12345")) {
            System.out.println("logged in");
        } else {
            for (int i = 1; i <= 3; i++) {
                if (i == 3) {
                    System.err.println("Your account is locked");
                    System.exit(0);
                }

                System.out.println("Invalid username or password please re enter: \n");
                System.out.println("enter your user name: ");
                username = scan.next();

                System.out.println("enter your password: ");
                password = scan.next();

                if (username.equals("cybertek") && password.equals("cybertek12345")) {
                    System.out.println("logged in");
                    break;
                }

            }

        }


    }
}
