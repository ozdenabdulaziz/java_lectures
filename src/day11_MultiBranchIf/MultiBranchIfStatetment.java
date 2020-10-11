package day11_MultiBranchIf;

public class MultiBranchIfStatetment {

    public static void main(String[] args) {

        int number = 100;

        if(number<0){
            System.out.println("Negative");
        }if(number > 0 ){
            System.out.println("Positive");
        }if(number == 0){
            System.out.println("Zero");
        }

        System.out.println("\n=====================================\n");

        if(number<0){
            System.out.println("Negative");
        }else if(number>0){
            System.out.println("Positive");
        }else if(number == 0 ){
            System.out.println("Zero");
        }else{
            System.out.println("404 EROR");
        }











    }
}
