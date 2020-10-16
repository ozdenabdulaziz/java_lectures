package day17_String;

import java.lang.String;

public class String_Mutability {

    public static void main(String[] args) {

        String wordOne = "Friday";
        String wordTwo = wordOne;
        String wordThree = "Friday";
        wordOne = "Monday";

        System.out.println(wordTwo);
        System.out.println(wordOne);
        System.out.println(wordOne == wordTwo); // true


    }

}
