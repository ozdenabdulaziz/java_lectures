package day10_IfElseStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 100;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3 < n2;
        boolean n2IsMin = !n3IsMin && n2 < n1;
        boolean n1IsMin = !n2IsMin && !n3IsMin;

        String massage = " Is minimum number";
        int min = 0;

        if(n1IsMin){
            //System.out.println(n1 + massage);
            min = n1;
        }
        if (n2IsMin){
            //System.out.println(n2 + massage);
            min = n2;
        }
        if (n3IsMin){
            //System.out.println(n3 + massage);
            min = n3;
        }

        System.out.println(min + massage);


    }
}

/*
	Task03: MinimumNumber
         write a java program that accepts three numbers and return the minimum number
                (assume that none of them)
 */