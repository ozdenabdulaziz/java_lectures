package day27_ForEachLoop;

public class reverse_string {

    public static void main(String[] args) {

        String[] names = {"Totti", "Del Piero", "Juninho", "Buffon", "Kaka"};

        for (String eachName : names) {

            String reversedName = "";

            for (int i = eachName.length() - 1; i >= 0; i--) {

                reversedName += eachName.charAt(i);

            }

            System.out.println(reversedName);

        }


    }
}
