package day12_NestedIf;

public class EligibleToVote {

    public static void main(String[] args) {

        String citizenShip = "USA";
        int age = 20;

        if(citizenShip == "USA"){
            if(age >= 18){
                System.out.println("You eligible to Vote");
            }else{
                System.out.println("You must be at least 18 years old");
            }
        }else{
            System.out.println("You must be US citizen in order to vote");
        }







    }
}
