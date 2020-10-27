package day23_NestedLoop;

public class do_while_practice {

    public static void main(String[] args) {

        for(int i =1; i <=20; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }

        System.out.println("\n-------------------------------\n");

        int i = 1;

        do{
            if(i%2 !=0) {
                System.out.println(i);
            }
            i++;
        }while (i<=20);

    }
}
