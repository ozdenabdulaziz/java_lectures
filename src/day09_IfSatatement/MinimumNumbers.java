package day09_IfSatatement;

public class MinimumNumbers {

    public static void main(String[] args) {



        int n1 = 200;
        int n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean isEqual = n1 == n2;

        if(n1IsMin) {
            System.out.println(n1 + " is minimum number");
        }
        if(n2IsMin) {
            System.out.println(n2 + " is minimum number");
        }
        if(isEqual) {
            System.out.println("Both are equal");
        }

    }
}
