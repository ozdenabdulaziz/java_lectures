package day27_ForEachLoop;

public class first_three_characters {

    public static void main(String[] args) {


        String[] names = {"Ronaldinho", "G.Ronaldo", "Messi", "G.Bale", "Ronney", "Modric", "Neymar", "Melo", "Pepe", "Puyol", "Pique"};

        for (String eachName : names) {
            System.out.println(eachName.substring(0, 3));
        }


    }
}
