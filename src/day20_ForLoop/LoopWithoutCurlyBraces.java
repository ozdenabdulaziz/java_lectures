package day20_ForLoop;

public class LoopWithoutCurlyBraces {

    public static void main(String[] args) {

        for(int i = 1; i<=5; i++){
            System.out.println("Hello");
            System.out.println("How are you");
        }

        System.out.println("\n------------------------------------\t---------------------------------------\n");

        for (int i =1; i<=5; i++)   // if you don't use curly braces just accept next statement.
            System.out.println("Hello");
            System.out.println("How are you");






    }
}
