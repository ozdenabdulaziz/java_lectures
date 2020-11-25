package office_Hours.Practice_11_25_2020;

public class MethodPractice {

    public static void main(String[] args) {

        divisibleBy3Between1To100();

        System.out.println();
        System.out.println("Hello");


        System.out.println("\n==============\t\t===============\n");


        divisibleBy3(100, 10);

        System.out.println("Test");

        System.out.println("\n==============\t\t===============\n");


        scoreOfGrade(90);

        System.out.println("\n==============\t\t===============\n");

        eligibleToVote(25,true);


    }

    public static void divisibleBy3Between1To100() {

        for (int i = 0; i <= 100; i++) {

            if (i % 3 != 0) { // if the number is not divisible by 3
                continue;   // then skip.
            }
            System.out.print(i + " ");
        }

    }


    public static void divisibleBy3(int start, int end) {

        if (end <= start) {

            System.out.println("Invalid numbers");
            // System.exit(0);
            return;     // exits only the current method

        }
        for (int i = start; i <= end; i++) {

            if (i % 3 != 0) { // if the number is not divisible by 3
                continue;   // then skip.
            }
            System.out.print(i + " ");
        }
    }


    public static void scoreOfGrade(int score) {

        if (score < 0 || score > 100) {     // if score is invalid
            System.out.println("Invalid Score");
            return;// exits the current method
        }

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        switch (grade) {

            case 'A':
                System.out.println("Excellent, you made an " + grade);
                break;

            case 'B':
                System.out.println("Great, you made an " + grade);
                break;

            case 'C':
                System.out.println("Good, you made an " + grade);
                break;

            case 'D':
                System.out.println("You Passed, you made an " + grade);
                break;

            default:
                System.out.println("You Failed, you made an " + grade);

        }

    }


    public static void eligibleToVote(int age, boolean isUSACitizen) {

        if (age < 18) {     // if age is not qualified
            System.out.println("You must be at least 18 years old");
            return;
        }

        if (isUSACitizen == false) {    // if the person is not us Citizen
            System.out.println("You must be a USA citizen to vote");
            return;
        }


        System.out.println("You are eligible to vote");


    }


}
