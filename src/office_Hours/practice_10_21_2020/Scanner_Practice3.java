package office_Hours.practice_10_21_2020;

import java.util.Scanner;

public class Scanner_Practice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Gender: ");
        String gander = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter Zip Code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your country: ");
        String countryName = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();
        scan.close();



    }
}

/*
        1.  ask gender( next() ) method
        2.  ask age ( nextInt() )
        3.  ask full name ( nextLine() )  ---> you need to give one extra nextLine();
        4.  ask zip code ( nextInt() )
        5.  ask country name ( nextLine() ) ---> you need to give one extra nextLine();
        6.  ask salary ( nextDouble() )
        7.  ask company name ( nextLine() ) ---> you need to give one extra nextLine();
        8.  ask address ( nextLine() )
 */