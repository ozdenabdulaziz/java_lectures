package day11_MultiBranchIf;

public class MaxMin2 {

    public static void main(String[] args) {

        int n1 = 40;
        int n2 = 60;
        int n3 = 90;

        int max = 0;

        if(n1 > n2 && n1 > n3){
            max = n1;
        }else if(n2>n1 && n2>n3){
            max = n2;
        }else{
            max = n3;
        }
        System.out.println("Maximum number in if: " + max);


        int max2 = (n1 > n2 && n1 > n3) ? n1 : (n2>n1 && n2>n3)? n2 : n3;

        System.out.println("Maximum number in Ternary: " + max2);

        System.out.println("\n======================================================\n");

        int min = 0;

        if(n1< n2 && n1<n3){
            min = n1;
        }else if(n2<n1 && n2<n3){
            min = n2;
        }else{
            min = n3;
        }

        System.out.println("Minimum number in If: " + min);


        int min2 = (n1< n2 && n1<n3)? n1 : (n2<n1 && n2 <n3) ? n2 : n3;

        System.out.println("Minimum number in Ternary: " + min2);

    }
}

/*
        3. Write a program that can find the maximum number between three defferent numbers
                first solution : if & else statement        // multi- branch if
                second solution: do not use any if statement        // do not use any if&else statement

        4. Write a program that can find the minimum number between three defferent numbers
                first solution : if & else statement        // multi- branch if
                second solution: do not use any if statement        // do not use any if&else statement
 */