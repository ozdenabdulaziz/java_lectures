package day23_NestedLoop;

public class nested_loop_intro {

    public static void main(String[] args) {

/*
        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println();
*/

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

        System.out.println("\n---------------------------\n");

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
