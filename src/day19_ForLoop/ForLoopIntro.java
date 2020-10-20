package day19_ForLoop;

/*
    for(    initialization; Condition; Iterrator    ) {
            statement;
 */

public class ForLoopIntro {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // 10 times print "Hello"

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }

        System.out.println("\n---------------------------\t-----------------------\n");

        String name = "Java";

        for (int i = 5; i > 0; i--) {        // i: 5, 4, 3, 2, 1, 0
            System.out.println(name);   //    1, 2, 3, 4, 5
        }

        //      OR

        for (int i = 1; i <= 5; i++) {
            System.out.println("java");
        }


    }
}
