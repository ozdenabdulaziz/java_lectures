package day11_MultiBranchIf;

public class DaysInMonths2 {

    public static void main(String[] args) {


        int month = 11;  // between 1 and 12;


        boolean has28Days = month ==2;
        boolean has30Days = month == 4 || month == 6 || month ==  9 || month == 11;
        boolean has31Days = !has28Days && !has30Days;     // month == 1 || month == 3 || month == 5 || month == 7 || month ==10 || month == 12;

        if(has28Days){

            System.out.println("28 Days");

        }else if(has30Days){

            System.out.println("30 Days");

        }else if(has31Days){

            System.out.println("31 Days");

        }else {

            System.out.println("404 EROR");

        }

        System.out.println("\n===========================\n");

        int days = 0;

        if(has28Days){
            days = 28;
        }else if(has30Days){
            days = 30;
        }else{
            days = 31;
        }
        System.out.println(days + " Days");
        System.out.println("\n===========================\n");

        int days2 = (has28Days)? 28 : (has30Days)? 30 : 30;

        System.out.println(days2 + " Days");




    }
}
