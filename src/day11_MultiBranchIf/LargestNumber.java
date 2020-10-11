package day11_MultiBranchIf;

public class LargestNumber {

    public static void main(String[] args) {

        int num1 = 90;
        int num2 = 40;
        int num3 = 50;

        if(num1 > num2 && num1> num3){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println(num3 + " is maximum number");
        }


        /*
        boolean largenum1 = num1 > num2 && num1 > num3;
        boolean largenum2 = num2 > num1 && num2 > num3;
        boolean largenum3 = !largenum1 && !largenum2;

        if(largenum1){
            System.out.println(num1 + " is the maximum number");
        }else if(largenum2){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println(num3 + " is maximum number");
        }

         */

    }
}
