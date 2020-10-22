package day20_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {   // ASCI table A ---> Z
            System.out.print((char) i + " - ");
        } //you need to write (char) for the ASCI table. --> if you don't write char it's will print 65 ---- 90 numbers.

        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " - ");
        }

        System.out.println();

        System.out.println("\n-----------------------------\t------------------------\n");

        for (int i2 = 97; i2 <=122; i2++){      // 97 in ASCI table = a ---> 122 in asci table = z
            System.out.print((char)i2 + " - ");
        }
        System.out.println();

        for(char i2 = 'a'; i2 <= 'z'; i2++){
            System.out.print(i2 + " - ");
        }

        System.out.println();

        System.out.println("\n-----------------------------\t------------------------\n");


        /*
        for (char b = 'A'; b <= 'Z'; ++b) {
            System.out.println(b + " ");
        }

        for(char a1 = 'a'; a1 <= 'z'; ++a1){
            System.out.println(" " + a1);
        }

        System.out.println("\n-----------------------------\t------------------------\n");

        for (char ch1 = 'Z'; ch1 >= 'A'; --ch1) {
            System.out.println(ch1);
        }

        for (char ch2 = 'z'; ch2 >= 'a'; --ch2) {
            System.out.println(ch2);
        }


         */

    }
}
/*
        	1. Write a program that will print out all alphabet letters

         	2. Write a program that will print out all alphabet letters in backwards

 */