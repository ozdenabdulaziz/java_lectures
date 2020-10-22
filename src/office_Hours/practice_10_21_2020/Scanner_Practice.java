package office_Hours.practice_10_21_2020;

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        scan.close();   // your program will be faster in this case.

        String grade = "";

        if (score >= 0 && score <= 100) {

        /*
            if (score >= 90) {    // becomes false when score < 90
                grade = "A";
            } else if (score >= 80) {   // becomes false when score < 80
                grade = "B";
            } else if (score >= 70) {  // becomes false when score < 70
                grade = "C";
            } else if (score >= 60) {  // becomes false when score < 60
                grade = "D";
            } else {
                grade = "F";
            }
        */

            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        } else {
            System.out.println("Invalid score");
        }

        System.out.println(grade);

    }
}
/*
       A:   90 - 100
       B:   80 - 89
       C:   70 - 79
       D:   60 - 69
       F:    0 - 59

     pre condition: 0 - 100
 */