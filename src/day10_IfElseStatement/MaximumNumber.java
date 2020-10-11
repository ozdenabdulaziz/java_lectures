package day10_IfElseStatement;

public class MaximumNumber {

    public static void main(String[] args) {
        // assume they are three different numbers
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;
        int n4 = 500;
        String massage = " Is maximum number";

        boolean n1Max = n1 > n2 && n1 > n3 && n1> n4;                     // if n1 is greater than both n2&n3, it means n1 is maximum number
        boolean n2Max = !n1Max && n2 > n3&& n2 > n4;                     //   n2 > n1 && n2 > n3;
        boolean n3Max = !n1Max && !n2Max && n3 >n4;                     //  n3 > n1 && n3 > n2;
        boolean n4Max = !n1Max && !n2Max && !n3Max;
        if(n1Max) {
            System.out.println(n1 + massage);
        }
        if(n2Max){
            System.out.println(n2 + massage);
        }
        if (n3Max) {
            System.out.println(n3 + massage);
        }
        if (n4Max){
            System.out.println(n4 + massage);
        }



    }

}

/*

	Task02: MaximumNumber
         write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */