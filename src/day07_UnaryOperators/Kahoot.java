package day07_UnaryOperators;

public class Kahoot {

    public static void main(String[] args) {

        float a = 100.9876543f;
        short b = (byte) a;

        System.out.println(b);
        System.out.println("\n============================================\n");

        System.out.println((3+2) *2/3%2);

        System.out.println("\n============================================\n");

        long a1 = 3_000L;

        double b1 = (float)a1;

        int c1 = (short)b1;

        System.out.println(c1%100);

        System.out.println("\n============================================\n");





    }

}
