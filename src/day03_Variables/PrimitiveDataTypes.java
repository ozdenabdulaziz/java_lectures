package day03_Variables;
/*
    Declare variables:
            DataType name = Data;
 */
public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // score is 85

        double score = 85;

        System.out.println(score);
        System.out.println("Score");

        long number1 = 9999999999l;
                        // after long data yu need to put the back lower or upper l - L

        //      long number2 = 9999999999;
                // int is prefered, compiler takes it as an int, and the number 9999999999 is out of int range

        double decimal1 = 0.5;
     //   float flota1 = 0.5; // double is prefered for decimals, compiler takes it as, double range is greater than float
       float float2 = 0.5f;

        System.out.println(float2);

        /*
            in future:
                        for integers: int
                        for decimal: double

         */


    }


}
