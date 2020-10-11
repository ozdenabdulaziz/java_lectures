package day09_IfSatatement;

public class OddOrEen {

    public static void main(String[] args) {

        int number = 1000;

        boolean even = number % 2 ==0;
        boolean odd = !even;

        System.out.println(number + " is even number: " + even);
        System.out.println(number + " is odd number: " + odd);

        System.out.println("\n\t\t================================================\n");

        int n = 200;

        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n + " is a positive number: " + isPositive);
        System.out.println(n + " is a negative number: " + isNegative);
        System.out.println(n + " is zero number: " + isZero);

        System.out.println("\n\t\t================================================\n");

        System.out.println( false == !true); // true

        System.out.println( false != true && !false == true); // true

        System.out.println(!false != false || false );  //true

        System.out.println(!false != false && false );  //true

        System.out.println( true && true && true && false ); // false

        System.out.println(false || false || false || false || true ); // true

        System.out.println("\n\t\t================================================\n");

        String weather = "Shinny";
        int dagree = 70;

        boolean r1 = (!(weather == "Rainy" || dagree == 70));

        System.out.println(r1);

    /*

            !yes ==> no
            !no ==> yes

            !funny ==> not funny
     */

        System.out.println(!!true); // true

        System.out.println(!!! false ); //true

        System.out.println(!!!!false); // false








    }

}
