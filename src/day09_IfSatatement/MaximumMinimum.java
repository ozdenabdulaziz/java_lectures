package day09_IfSatatement;

public class MaximumMinimum {

    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 200;


        // maximum
        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;

        if(n1IsMax) {
            System.out.println(n1 + " is maximum number");
        }
        if(n2IsMax) {
            System.out.println(n2 + " is maximum number");
        }


        // minimum
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;

        if(n1IsMin) {
            System.out.println(n1 + " is minimum number");
        }
        if(n2IsMin) {
            System.out.println(n2 + " is minimum number");
        }


        // equal
        boolean equal = !n1IsMax && !n2IsMax;

        if(equal) {
            System.out.println(n1 + " and " + n2 + " are equal numbers");
        }






    }
}

/*
        int num1 = 20;
        int num2 = 30;

        boolean b1 = num1 > num2;
        boolean b2 = num2 > num1;
        boolean b3 = num1 == num2;
        if (b1) {
            System.out.println(num1 + " is the maximum number");
        }
        if(b2) {
            System.out.println(num2 + " is the maximum number");
        }
        if(b3) {
            System.out.println(num1 + " and " + num2 + " equal number.");
        }

*/
