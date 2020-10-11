package day11_MultiBranchIf;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 3;

        boolean days28 = month ==2;
        boolean days30 = month == 4 || month == 6 || month ==  9 || month == 11;
        boolean days31 = !days28 && !days30;     // month == 1 || month == 3 || month == 5 || month == 7 || month ==10 || month == 12;

        int days = 0;


        if(days28){
            days = 28;
        }

        if(days30){
            days = 30;
        }

        if(days31){
            days = 31;
        }

        System.out.println(days+" days");
      /*
        if(days28){
            System.out.println("28 days");
        }if(days30){
            System.out.println("30 days");
        }if(days31){
            System.out.println("31 days");
        }else{
            System.out.println("404 EROR");
        }

      */




    }

}

/*
 1. write a program that can find the number of days in a month
            (Assume that Feb has 28 days)
                Ex:
                    month = 3
                    output:
                        31 days
                    month = 9
                    output:
                        30 days

        28 days = 2
        30 days = 4, 6, 9, 11
        31 days = 1, 3, 5, 7, 10, 12;
 */