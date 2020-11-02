package day26_Arrays;

import java.util.Scanner;

public class min_max_in_array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many number would you like to enter: ");
        int length = scan.nextInt();

        int[] numbers = new int[length];

        for(int i = 0; i <=length-1; i++){  // gets the user inputs and stores into the array starting from index 0

            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();

        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 0; i <length; i++){

            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
