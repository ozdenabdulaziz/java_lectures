package day07_UnaryOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        short a = 3000;
        long b = a; // impliciting casting
        // 3000L

      // int c = b; // casting must be done manually

        int d = a; // implicit casting, automaically done

        double d1 = 200.5;
        int i1 = (int) d1; //  200

        System.out.println(i1);


        System.out.println("\n================================================\n");

        long l1 = 100;
        short s1 = (short) l1; // 100

        System.out.println(s1);

        double d2 = 300;
        float f1 = (float) d2;

        System.out.println(f1); // 300.5

        // For Windows: Holding Alt + hit Enter
        // For Mac: holding Option + hit Enter


        long l2 = 300;   // implicit casting
               // 300L
        int i2 = (int) l2;

        System.out.println(i2);         // 300

        System.out.println("\n================================================\n");


        short s2 = 400;
        byte b1 = (byte) s2; // byte = -127, 127

        System.out.println(b1); // value 400 is out of byte range and casting does not change the limit of data type.


        long l3 = 100;
        byte b2 = (byte) l3; // -128, 127
        System.out.println(b2);


    }

}
