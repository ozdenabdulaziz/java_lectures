package day10_IfElseStatement;

public class IfElseStatement {

    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number%2 == 0;

        if(isEven){  // for even number
            System.out.println(number + " is even");
        }
        if(!isEven){
            System.out.println(number + " is odd");
        }
        System.out.println("\n==================================================================\n");

        if(isEven){
            System.out.println(number + " is even");
        }else{
            System.out.println(number+ " is odd");
        }

        System.out.println("\n==================================================================\n");

        int score = 85;

        if(score >= 60) {
            System.out.println("Passed the exam");
        }else{
            System.out.println("Failed the exam");
        }





    }
}
