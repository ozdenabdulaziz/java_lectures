package day17_String;

import java.lang.String;    // This package is always automatically importing

public class String_Memory {

    public static void main(String[] args) {

        /*
                                    String pool:
         strOne -->                   "java"     <-- strTwo
                                      "java"     <-- strFive

                                   Heap:
                                       "java" <-- strThree
                                       "java" <-- strFour
         */

        String strOne = "java"; // literal
        String strTwo = "java"; // literal
        String strThree = new String("java");  // don't type original (automatically writing original)
        String strFour = new String("java");

        System.out.println(strOne == strTwo);   // True
        System.out.println(strOne == strThree); // false
        System.out.println(strThree == strFour);// false

        String strFive = "java";    // made in the string pool

        System.out.println(strOne == strFive);  // false


    }
}
