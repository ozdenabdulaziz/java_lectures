package day09_IfSatatement;

public class EligibleToBuyAlcohol2 {

    public static void main(String[] args) {

        int age = 20;

        boolean eligible = age >= 20;

        if(eligible) {
            System.out.println("You are eligible to buy alcohol");
        }

        if(!eligible) {
            System.out.println("Go buy your Milk");
        }
        System.out.println("\n\t\t=================================================\n");

        boolean isBreakTime = false;

        if(isBreakTime) {
            System.out.println("Time to take break");
        }

        if(!isBreakTime){
            System.out.println("Let\'s continue the class");
        }








    }
}
