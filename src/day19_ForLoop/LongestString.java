package day19_ForLoop;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first String: ");
        String str1 = scan.nextLine();

        System.out.println("Enter your second String");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length() ){
            System.out.println(str1);
        }else if(str2.length() > str1.length()){
            System.out.println(str2);
        }else{
            System.out.println("Both are equal");
        }

    }
}

/*
    1. write a program that can return the longest string from two suer inputs

 */