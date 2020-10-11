package day11_MultiBranchIf;

public class DaysInWeek2 {

    public static void main(String[] args) {

        int n1 = 5;

        String day = (n1 == 1)? "Monday" : (n1==2)? "Tuesday" : (n1 ==3)? "Wednesday" : (n1 ==4)? "Thursday" : (n1==5)? "Friday" : (n1==6)? "Saturday" : "Sunday";

        System.out.println(day);


    }
}
