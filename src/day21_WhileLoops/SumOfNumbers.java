package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
/*
       Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
			hint: you need an infinite loop
 */

        Scanner scan = new Scanner(System.in);

        int result1 = 0;    //  5 + 10 = 15 + 20 = 30;

        for(int i = 0; i<1;){

            System.out.println("enter a number: ");
            int num1 = scan.nextInt();  //5
            result1 +=num1;

            if(num1<0){
                break;          // if the  user entered number is negative it will not be added to teh result.
            }else{
                result1 += num1;
            }
        }

        scan.close();
        System.out.println("Result: " + result1);

/*
        System.out.println("how many times you want to enter a number ");
        int times = scan.nextInt();
        int result = 0;
        for(int i =0; i<=times; i++){
            System.out.println("Enter a number: "+ i);
            result +=scan.nextInt();
        }

        System.out.println("result = " + result);

*/
    }
}
