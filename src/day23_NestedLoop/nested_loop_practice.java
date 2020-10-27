package day23_NestedLoop;

public class nested_loop_practice {

    public static void main(String[] args) {


        for (int j = 1; j <= 8; j++) {  // 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t");
            for (int i = 1; i <=j; i++) {   // 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("\n------------------------------\n");

        for (int j = 1; j <= 8; j++) {  // 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t");
            for (int i = 1; i <=j; i++) {   // 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
