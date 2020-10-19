package day18_Strings;

import java.util.Scanner;

public class SubStringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words: ");

        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        String result = word1.substring(1, word1.length() - 1 + 1) + word2.substring(1, word2.length() - 1 + 1);

        System.out.println(result);


    }

}
/*
1.	Ask user to enter two words. print first word without its first character then print the second word without its first character

					input:
							apple
							banana

					output:
							ppleanana
 */