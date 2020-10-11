package day09_IfSatatement;

public class EligibleToVote2 {

    public static void main(String[] args) {

        String name = "Jimmy";
        boolean isUSCitizen = false;
        int age = 25;
        boolean hasCriminalBackground = false;
        boolean isEligible = isUSCitizen == true && age >= 18 && hasCriminalBackground == false;
        //                        false == true &&  25 >= 18  && false == false;
        //                              false &&  true &&  true
        //                                  false  && true
        //                                         false
        System.out.println(name + " is elgibile to Vote: " + isEligible);

        System.out.println("\n=================================================================\n");

        String name2 = "Jhon";
        String c1 = "CHINA";
        String c2 = "CANADA";

        boolean eligible = c1 == "USA"  ||  c2 == "USA" ;
        //              canada  == USA ||   "USA" == "USA"
        //                  false       ||  true
        //                              true

        System.out.println(name2 + " is eligible to vote: " + eligible);

    }

}
