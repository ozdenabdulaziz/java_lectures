package office_Hours.practice_10_21_2020;

import java.util.Scanner;

public class Scanner_Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // EnterEnter

        System.out.println("Enter a price: ");
        double price = scan.nextDouble();   // 80 enter

        System.out.println("Price: " + price);

        System.out.println("Enter the name of the item: ");
        String item = scan.next();  //tomato
        System.out.println("Item: " + item);

        scan.nextLine();    //EnterEnter    we need this extra nextLine we are using nextLine() method after another scanner method.

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();  //EnterEnter
        scan.close();

        System.out.println("Full name: " + fullName);


    }
}
