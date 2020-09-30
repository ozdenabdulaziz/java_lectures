package day07_UnaryOperators;

public class EvenlyDivisibility {

    public static void main(String[] args) {

        int number = 99;
        int remainderOf2 = number % 2; // 0
        boolean divisibleBy2 = remainderOf2 < 1;
                                //0     <   1

        int remainderOf3 = number % 3;
        boolean divisibleBy3 = remainderOf3 < 1;
                    //              2 < 1

        int remainderOf5 = number % 5; //0
        boolean divisibleBy5 = remainderOf5 < 1;
                    //                  0   < 1


        System.out.println(number +" is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);

    }

}

/*
    . Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,

            Ex:
                number = 65;  ==> int
                divisibleBy2 ==> true/false
                divisibleBy3 ==> true/false
                divisbileBy5 ==> true/false

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

                number = 80;

            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

            Hint: if the remainder < 1 (means 0) ==> evenly divisible

            > , <
            65 % 2 < 1; ===> 65 evenly divisible by 2
            65 % 3 < 1; ===> 65 evenly divisible by 3
            65 % 5 < 1; ===> 65 evenly divisible by 5


 */