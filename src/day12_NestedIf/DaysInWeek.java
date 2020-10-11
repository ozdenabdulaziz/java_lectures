package day12_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 19;

        String days = "";

        if(number >=1 && number <=7){
                if(number==1){
                    days = "Monday";
                }else if(number==2){
                    days = "Tuesday";
                }else if(number==3){
                    days = "Wednesday";
                }else if(number==4){
                    days = "Thursday";
                }else if(number==5){
                    days = "Friday";
                }else if(number==6){
                    days = "Saturday";
                }else if(number==7){
                    days = "Sunday";
                }
        }else{
            System.out.println("please enter a number between 1 ~ 7");
        }

        System.out.println(days);



    }
}
