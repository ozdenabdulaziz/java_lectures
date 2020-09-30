package day08_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {

        int num1 = 1000;
        int num2 = 20000;

        boolean r1 = num1 > num2; //num1 is greater than num2
        boolean r2 = num2 > num1; //num2 is greater than num1

        boolean r3 = num1 < num2; // num1 is less than num2
        boolean r4 = num2 < num1; // num2 is less than num1

        System.out.println(num1+ " is greater than " + num2 + " : "+ r1);
        System.out.println(num2+" is greater than "+ num1 +" : "+ r2 );

        System.out.println(num1+" is less than "+ num2 +" : "+r3);
        System.out.println(num2+" is less than "+num1 +" : "+r4);

        System.out.println("==================================");

        System.out.println( 10 > 9 );
        System.out.println( 10 < 9);

        System.out.println("====================================");
        // >=, <=

        System.out.println(  10 > 10 ); // false
        System.out.println( 10 >= 10); // 10 is greater or equal to 10 ==> true

        System.out.println( 10 < 9 ); // false
        System.out.println( 10 <= 9); // 10 is less than or equal to 9 ==> false

        System.out.println("======================================");
        // ==, !=

        boolean b1 = 10 == 10;
        boolean b2 = 10 != 10;
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("======================================");

        boolean b3= "Cybertek" == " Virginia";
        boolean b4= "Aziz" == "Aziz";
        System.out.println(b3);
        System.out.println(b4);

        boolean b5 = "Aziz" != "Goog guy";
        System.out.println(b5);

        System.out.println("======================================");









    }

}
