package day11_MultiBranchIf;

public class   TernaryPractice {

    public static void main(String[] args) {

        int n = 100;

        String result1 = "";


        if(n%2==0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }

        System.out.println(result1);

        System.out.println("\n======================================================\n");

        String result2 = (n%2==0) ? "Even" : "Odd";
                //               if        else
        System.out.println(result2);

        System.out.println("\n=========================================================\n");

        int age = 25;

        String citizenShip = "USA";

        String eligibleToVote = (age >=18 && citizenShip =="USA")? "Eligible To Vote" : "Note eligible to Vote";
                                            //                   if                   else
        System.out.println(eligibleToVote);

        System.out.println("\n=========================================================\n");

        int personalAge = 18;

        String buyAlcohol = (personalAge >=21) ? "Eligible to buy alcohol" : "Not eligible to buy alcohol";
                                        //     if                          else
        System.out.println(buyAlcohol);


        System.out.println("\n=========================================================\n");

        int number = 1000;

        String s1 = "";

        if(number >0){
            s1 = "Positive";
        }else if(number<0){
            s1 = "Negative";
        }else{
            s1 = "Zero";
        }

        System.out.println(s1);

        String s2 = (number>0)? "Positive" : (number<0) ? "Negative" : "Zero";

        System.out.println(s2);













    }
}
