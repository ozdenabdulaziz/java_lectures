package day09_IfSatatement;

public class OddAndEven {

    public static void main(String[] args) {

        int number = 200;

        boolean even = number %2 == 0;

        if (even) {
            System.out.println(number + " is a even number");
        }
        if (!even){
            System.out.println(number + " is a odd number");
        }




    }
}

/*

    1. write a program that can check if the given number is odd or even
        Ex:
            number = 100;
            output:
                100 is even number
            number = 101
            output:
                101 is odd number

 */