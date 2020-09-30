package day03_Variables;

public class CalculateRectangele {

    public static void main(String[] args) {

  // width: 5, length: 20

        int width = 5;
        int length = 20;
        int area = width * length;
//                  5    *    20
        int perimeter = width*2 + length*2;

        System.out.print("Area is: ");
        System.out.print( area );
        System.out.println();
        System.out.print("Perimeter is: ");
        System.out.print( perimeter );
        System.out.println();
        System.out.println("=====================");
        System.out.print("Area is: ");
        System.out.println(width * length);
        System.out.println("Or");
        System.out.println( area );

        System.out.println("=====================");




    }

}
