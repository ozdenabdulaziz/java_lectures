package day06_AritmeticOperators;

public class DivisionCalculator {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 20;

        int result = num1 / num2;           // bolme islemi
        int remainder = num1 % num2;        // kalan sonuc


        String finallResult = num1 + " divide by " + num2 + " is equal to " + result + " with a remainder of " + remainder;

        System.out.println(finallResult);

       // System.out.println(num1 + " divide by " + num2 + " is equal to " + result + " with a remainder of " + remainder);

        System.out.println("\n =============================================================== \n");

        // System.out.println( 9/ 0 );  it not working. you need to use int or some variable







/*
        int num1 = 10;
        int num2 = 3;

        int num3 = 20;
        int num4 = 6;

        int num5 =100;
        int num6 =20;

        System.out.println("10 divide by 3 is equal to 3 with a remainder of "+num1 % num2);
        System.out.println("20 divide by 6 is equal to 3 with a remainder of "+num3 % num4);
        System.out.println("100 divide by 20 is equal to 5 with a remainder of "+num5 % num6);
*/

    }


}

/*
        task: DivisionCalculator

            write a program that can calculate first number by second number. and print out result.

                num1 = 10;
                num2 = 3;

                output:
                        10 divide by 3 is equal to 3 with a remainder of 1

                num1 = 20;
                num2 = 6;

                output:
                        20 divide by 6 is equal to 3 with a remainder of 2




 */