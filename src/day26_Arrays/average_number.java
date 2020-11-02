package day26_Arrays;

import java.util.Scanner;

public class average_number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many number?");

        int length = scan.nextInt();

        int[] numbers = new int[length];
        int sum = 0;

        for (int i = 0; i <= length - 1; i++) {

            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        int average = sum / length;
        //  double average = (double)sum / length;

        System.out.println("sum = " + sum);
        System.out.println("Average = " + average);


    }
}
