package day11_MultiBranchIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int month = 1;

        String nameOfMonth =(month ==1)? "Jan" : (month ==2) ? "Feb" : (month==3)? "March" : (month==4)? "Apr" : (month==5)? "May" : (month==6)? "Jun" : (month==7) ? "Jul" : (month==8)? "Aug" : (month==9) ? "Sep" : (month==10)? "Oct" : (month==11) ? "Nov" : "Dec";

        System.out.println(nameOfMonth);




    }
}

/*

Tasks2:
        write a program that can print out the name of the month based on the number 1~12

            number = 1;     // 1~12

            output:
                    january
 */
