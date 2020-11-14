package day28_MultiDimensionalArray;

public class longest_string {

    public static void main(String[] args) {


        String[] names = {"Neymar", "Messi", "G.Ronaldo", "Xavi"};

        String longest = names[0];
        String shortest = names[0];



        for( String each : names){

            if(each.length() > longest.length()){
                longest = each;
            }

            if(each.length() < shortest.length()){
                shortest = each;
            }
        }

        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);












    }
}
