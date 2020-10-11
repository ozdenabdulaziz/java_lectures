package day11_MultiBranchIf;

public class MaxMin1 {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        int max1 = 0;

        if(a>b){
            max1 = a;
        }else if(b>a){
            max1 = b;
        }else{
            System.out.println("Both equal");
        }

        System.out.println("Maximim number in if: "+ max1 );


        int max2 = (a>b)? a : b;

        System.out.println("Max number is ternary " + max2);

        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");

        int min1 = 0;

        if(a<b){
            min1 = a;
        }else if(b>a){
            min1 = b;
        }else{
            System.out.println("both equals");
        }

        System.out.println("Minimum number in if: " + min1);

        int min2 = (a>b)? a : b;

        System.out.println("Minimum number in Ternary: " + min2);




    }

}

/*
  1. Write a program that can find the maximum number between two defferent numbers
                first solution : if & else Statement
                second solution: do not use any if statement

  2. Write a program that can find the minimum number between two defferent numbers
                first solution : if & else Statement
                second solution: do not use any if statement
 */