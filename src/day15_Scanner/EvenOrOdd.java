package day15_Scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");


        int num1 = scan.nextInt();

        if(num1 % 2 == 0){
            System.out.println(num1 + " is a even number");
        }else{
            System.out.println(num1 + " is a odd number");
        }



    }

}
