package day05_Concatenation;

public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "Abdulaziz";
        String lastName = "OZDEN";
        String fullName = firstName + " " + lastName;
        int age = 29;
        char gender = 'M';
        long phoneNumber = 6138907201l;
        long ssn = 123456789l;


        System.out.println("Full name is: " + fullName);
        System.out.println("Your age is: " + age + " years old");
        System.out.println("Gender is: " + gender);
        System.out.println("Phone number is: +1" + phoneNumber);
        System.out.println("SSN is: " + ssn);




    }

}
/*

            task: personalInfo

	Variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN

	output:

				full name is : yourFullName
				age is: yourAge  years old
				gender is: YourGender
				phone number is: yourPhoneNumber
				SSN is: YourSSN

			please use concatenation, do not use more than 5 rint statements


 */