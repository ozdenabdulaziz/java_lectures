package day11_MultiBranchIf;

public class DaysInWeek {

    public static void main(String[] args) {


        int number = 6;
        String day = "";

        if (number ==1){
            day = "Monday";
        }else if(number == 2){
            day = "Tuesday";
        }else if(number == 3){
            day = "Wednesday";
        }else if(number == 4){
            day = "Thursday";
        }else if(number == 5){
            day = "Friday";
        }else if(number == 6){
            day = "Saturday";
        }else{
            day = "Sunday";
        }

        System.out.println(day);


     /*
        int n1 = 1;

        if(n1 >0 && n1 <2){
            System.out.println("Monday");
        }else if(n1 >1 && n1 <3 ){
            System.out.println("Tuesday");
        }else if(n1 >2 && n1 <4){
            System.out.println("Wednesday");
        }else if(n1 >3 && n1 <5){
            System.out.println("Thursday");
        }else if(n1 >4 && n1 <6){
            System.out.println("Friday");
        }else if(n1 >5 && n1 <7){
            System.out.println("Saturday");
        }else if(n1 >6 && n1 <8){
            System.out.println("Sunday");
        }else{
            System.out.println("Please enter a number between 1 ~ 7");
        }

      */


    }
}

/*
Tasks:
        Write a program that can rint out the name of the day based on the number.

        number = 1
            out: monday

        number = 5
            out: friday

 */