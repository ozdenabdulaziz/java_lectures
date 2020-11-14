package day29_Methods;

public class Methods_without_parameters_2 {

    public static void main(String[] args) {

        printOddNumbers1To100();

        printEvenNumbers1To100();

        System.out.println("\n Hello World");


    }


    public static void printEvenNumbers1To100() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers1To100() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


}

/*

        Void method without parameter

        Void method with parameter

        return methods

        overloading
 */