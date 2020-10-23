package day21_WhileLoops;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i + " ");
        }

        System.out.println("\n--------------------------\t---------------------------------\n");
//      print odd number between 1 ~ 50 (Must use continue statement)

        for (int i1 = 0; i1 <= 50; i1++) {

            if (i1 % 2 == 1) {
                continue;
            }
            System.out.print(" " + i1);

        }
        System.out.println("\n--------------------------\t---------------------------------\n");
//      Print even numbers between 1~50 (must use continue statement
        for(int i2 = 0; i2 <=50; i2++){

            if(i2 % 2 == 0){
                continue;
            }
            System.out.print(" " + i2);

        }
        System.out.println("\n--------------------------\t---------------------------------\n");
//      print numbers between 1  to 50 that are evenly divisible by 3 must use continue statement

        for(int i3 = 0; i3 <=50; i3++){

            if(i3 % 3 != 0){
                continue;
            }
            System.out.print(" " + i3);
        }



    }
}
