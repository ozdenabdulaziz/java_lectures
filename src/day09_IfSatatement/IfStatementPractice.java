package day09_IfSatatement;

public class IfStatementPractice {

    public static void main(String[] args) {

        boolean isPandemic = false;

        if(isPandemic) {
            System.out.println("Wear mask");
            System.out.println("Buy more toilet papers");
            System.out.println("Stay at home");
        }
        if(!isPandemic){
            System.out.println("Live free");
        }

        System.out.println("\n\t\t=======================================================\n");

        String name = "David";
        int age = 20;
        boolean isUSCitizen = false;

        boolean eligible = age >= 18 && isUSCitizen;
        //                  true    falese ===> false

        if(eligible) {
            System.out.println(name + " is eligible to vote" );
        }
        if(!eligible) {
            System.out.println(name + " is not eligible to vote");
        }






    }

}

/*

  2. write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal
 */