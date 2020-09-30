package day08_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a;
        a = 10;
        System.out.println(a); // a =10
        a= 30;
        System.out.println(a); // a = 30

        System.out.println("\n================================================\n");

        String schoolName = "Cybertek";
        System.out.println(schoolName);
        schoolName = "M.I.T.";
        System.out.println(schoolName);

        System.out.println("\n================================================\n");

        int x = 100;    // 100 - 62 = 38
            x -= 62;

        System.out.println(x);

        double salary = 100000;
               salary -= salary * 0.28;

        System.out.println(salary);

        System.out.println("\n================================================\n");

        int x2 = 999999;
            x2 -= 25;

        System.out.println(x2);

        System.out.println("\n================================================\n");

        double balance = 2000;
               balance -= 450;

        System.out.println(balance);

        System.out.println("\n================================================\n");

        String name = "Cybertek";
                name += " School";

        System.out.println(name);  // Cybertek School

        System.out.println("\n================================================\n");

        double totalTax = 100000;
                totalTax *=0.28;    // totalTax = 100000 * 0.28;

        System.out.println(totalTax);

        System.out.println("\n================================================\n");

        int bonus = 5000;
            bonus *= 2+1;   // bonus = 5000 * 3

        System.out.println(bonus);

        System.out.println("\n================================================\n");

        int y3 = 10;
            y3 /=5; // y3 = 10 / 5;

        System.out.println(y3); // 2

        System.out.println("\n================================================\n");

        int house = 500000;
        int month = 240;

        double monthlyPayment = 500000;  //    double monthlyPayment = house;
                monthlyPayment /= 240;  // monthlyPayment /= month;

        System.out.println(monthlyPayment);


        System.out.println("\n================================================\n");

        // 100 / 3; ===> 99.33333 ==>  reaminder: 1

        int a2 = 100;
            a2 %= 3; // 100 % 3 = 1

        System.out.println(a2); // 1







    }

}
