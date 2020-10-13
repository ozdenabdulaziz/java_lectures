package day15_Scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        byte age = info.nextByte();

        System.out.println("Please enter your favorite number: ");
        long favoriteNumber = info.nextLong();

        System.out.println("Are you Student currently (True or False)");
        boolean student = info.nextBoolean();

        System.out.println("Your age: " + age);
        System.out.println("Your favorite number: " + favoriteNumber);
    //  System.out.println("Are you Student: " + student);

        if(student ==true){
            System.out.println("Great, you are a student!");
        }else{
            System.out.println("Oh okay, you are not a student");
        }


    }
}

/*
Task:
	ask the user to enter their age (with byte), ask them to enter their favorite number (with long) and ask them if they are a student (boolean). print all the values from the inputs.


 */