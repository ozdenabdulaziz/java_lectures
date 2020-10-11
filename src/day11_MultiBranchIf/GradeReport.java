package day11_MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {


        int score = 70;  // between 0 ~ 100;

        String result = " ";

        if(score < 60){
            result = "Failed";
        }else if(score >=60 && score < 90){
            result = "Passed";
        }else{
            result = " Passed With distinction";
        }


    /*

        boolean fail = score < 60;
        boolean pass = score >=60;

        if(fail){
            System.out.println("Failed");
        }else if(pass){
            System.out.println("Passed");
        }else{
            System.out.println("Passed with distinction");
        }


     */


        /*

        if(score < 60){
            System.out.println("Failed");
        }else if(score >=60 && score <90){
            System.out.println("Passed");
        }else{
            System.out.println("Passed with distinction")
        }

         */


    }

}
