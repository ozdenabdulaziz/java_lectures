package day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {

        int x = 2;
        int y = x++; //post: increment: first passes current value 2

        System.out.println(x); // x= 3
        System.out.println(y); // y = 2

        System.out.println("\n============================================\n");

        int x2 = 2;

        System.out.println( x2++); // 2
        System.out.println(x2); // 3

        System.out.println("\n============================================\n");

        int x3 = 2;
        System.out.println(--x3); // 1
        System.out.println(++x3); // 2

        System.out.println("\n============================================\n");

        int x4 = 8;
        int y4 = x4--; // 8

        System.out.println(y4);
        System.out.println(x4);

        System.out.println("\n============================================\n");

        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        //      -1  +  0   /  -1 *  -1
        // -1 + 0 * -1
        // -1 + 0 == -1

        System.out.println(b);

        System.out.println("\n============================================\n");

        int A= 50;
        int B = --A + A++ + A-- + A++;
        // B =  49 +  49  + 50  + 49;

        System.out.println(B);


        System.out.println("\n============================================\n");

        int X = 4;
        int Y = X * 4 - X++;
        //      16 - 4 = 12
        System.out.println(Y);


        System.out.println("\n============================================\n");


        int t = 100; //
        int p = - ++t * - t-- / t++ + --t;
        //  p = -101  * -101  / 100 + 100
        //  p = 10201 / 100 + 100
        //  p = 102 + 100
        //  p = 202

        System.out.println(p);

        System.out.println("\n============================================\n");

        int R = 20; //19
        int W = -R-- + -R++ + --R * R-- %2;
        //  W =  -20  + -19  + 19  * 19  % 2;
        //  W = -20 + -19 + 361 % 2;
        //  W = -20 + -19 + 1;
        //  W = - 39 + 1;
        //  W = -38;

        System.out.println(W);

        System.out.println("\n============================================\n");

        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        //  U = 301  + 400 - 301 % 2 + 400 % 2;
        //  U = 301  + 400 -  1      +     0
        //  U = 701 - 1 + 0;
        //  U = 700;


        int J =  M  +  N  -  M  *  N  +  M  /  N ;
        //  J = 300 + 400 - 300 * 400 + 300 / 400;
        //  J =

        System.out.println(J);







    }

}
