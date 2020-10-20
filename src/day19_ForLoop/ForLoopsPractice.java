package day19_ForLoop;

public class ForLoopsPractice {

    public static void main(String[] args) {

        for (int i1 = 0; i1 <= 1000; i1++) {
            System.out.println(i1);
        }
        /*
                Print out the numbers between 0 ~ 1000
        */

        System.out.println("\n----------------------------\t--------------------------\n");
        /*
                Print out the numbers between 1000 ~ 2000;
        */
        for (int i2 = 1000; i2 <= 2000; i2++) {
            System.out.println(i2);
        }

        System.out.println("\n----------------------------\t--------------------------\n");
        /*
                Print out all the odd numbers between 0 ~ 1000
        */

        for (int i3 = 0; i3 <= 100; i3++) {
            if (i3 % 2 == 1) {
                System.out.println("Odd number: " + i3);
            }
        }

        // OR

        for (int i3 = 1; i3 <= 100; i3 += 2) {
            System.out.println(i3);
        }
        System.out.println("\n----------------------------\t--------------------------\n");

        /*
                Print out all the Even numbers between 0 ~ 1000
        */

        for (int i4 = 0; i4 <= 100; i4++) {
            if (i4 % 2 == 0) {
                System.out.println("Even number: " + i4);
            }
        }
        // OR
        for (int i6 = 0; i6 <= 100; i6 += 2) {
            System.out.println(i6);
        }

        System.out.println("\n----------------------------\t--------------------------\n");
        /*
                do 50 push ups
         */
        for (int i5 = 1; i5 <= 50; i5++) {
            System.out.println("Push Up " + i5);
        }

        System.out.println("\n----------------------------\t--------------------------\n");

        /*
            Write program that can print a ~ z in same line sperated by space
        */

        char a;

        for (a = 'a'; a <= 'z'; ++a) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("\n----------------------------\t--------------------------\n");

        /*
            Write program that can print A ~ Z in same line sperated by space
        */

        char b;

        for (b = 'A'; b <= 'Z'; ++b) {
            System.out.print(b + " ");
        }

        System.out.println();

        System.out.println("\n----------------------------\t--------------------------\n");

        /*
            Print out the first 30000 characters in same line sperated by space
         */

        for (int i = 0; i <= 30000; i++){

            System.out.print((char)i + " ");
        }


    }
}
