package day20_ForLoop;

import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String word = scan.nextLine();

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {  // get the characters in backwards. for that we need use i--

            result += word.charAt(i);

        }

        /*

        if (result.equalsIgnoreCase(word)) {

            System.out.println(word + " is palindrome ");

        } else {

            System.out.println("Word is not palindrome ");

        }


         */

        System.out.println(word + " " + (word.equalsIgnoreCase(word) ? "is palindrome" : "is not palindrome"));


    }
}

/*

        write a program that can verify if the user entered String is palindrome

			ex:
				input: Level
				output: Level is palindrome

				input: java
				output: java is not palindrome
 */