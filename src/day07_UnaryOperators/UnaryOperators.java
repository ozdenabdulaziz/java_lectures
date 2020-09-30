package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = -100;
        boolean positive = a > 0;  // verify if a is positive
        boolean negative = a < 0;  // verify if a is negative

        System.out.println(a + " is positive number: " + positive);
        System.out.println(a + " is negative number: " + negative);

        int b = -100 -20; // -120
        System.out.println(b);


        int c  = 10 - -20; // 10 + 20
        System.out.println(c);

        int d = 10 * -4; // -40
        System.out.println(d);

        int e = -10 * 4; // -40
        System.out.println(e);

        int f = -10 * -4; // 40
        System.out.println(f);

        System.out.println("\n============================================\n");

        int x = 100;
        ++x; // x = 101 // increases the value by1, 100 + 1 = 101;
        System.out.println(x);

        int y = 100;
        --y; // 99 // decreases the value by 1, 100 -1 = 99;
        System.out.println(y);

        int z = 100;
        System.out.println(--z);

        int x2 = 100;
        System.out.println(++x2);

        System.out.println("\n============================================\n");

        // POST:

        int a2  = 100;
        System.out.println(++a2); // 101
        System.out.println(a2++); // 100
        System.out.println(a2); //102

        int b2 = 100;
        System.out.println( b2-- ); //100
        System.out.println(b2);




    }

}
