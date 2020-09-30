package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {

        String firstName = "Abdulaziz";
        String lastName = "Ozden";
        String fullName = firstName + ' ' +lastName;
        char gender = 'M';
        int age = 29;
        String companyName = "Bank of America";
        String jobTitle = "SDET";
        double salary = 120000.50;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee' fullname is: " + fullName);
        System.out.println(fullName + "' gender is: " + gender);
        System.out.println(fullName + "' age is: " + age +" years old");
        System.out.println(fullName + "' works at: " + companyName);
        System.out.println(fullName + "' Job title is: " + jobTitle);
        System.out.println(fullName + "' salary is: $" + salary);
        System.out.println(fullName + "' is full time: " + isFullTime);
        System.out.println(fullName + "' is married: " + isMarried);


    }

}

/*
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

 */