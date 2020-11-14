package day28_MultiDimensionalArray;

import java.util.Arrays;

public class array_practice {

    public static void main(String[] args) {

        String[][] scrumTeam = {{"Dorin", "Adil", "Fatih", "Subhi"}, {"Katrin", "Mustafa", "Ruslan"}, {"Ayse"}, {"Omid"}, {"Agalar"}};
        String[] tester = scrumTeam[0];
        String[] develop = scrumTeam[1];
        String[] sm = scrumTeam[2];
        String[] po = scrumTeam[3];
        String[] ba = scrumTeam[4];

        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("==========================================");

        for (int i = 0; i < scrumTeam.length; i++) {   // i: index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i]));  // prints the ach group in scrum team

            for (int j = 0; j < scrumTeam[i].length; j++) {
                System.out.println(scrumTeam[i][j]);
            }
        }
        System.out.println("==========================================");

        for (String[] eachGroup : scrumTeam) {   // eachGroup: represent each 1D array in scrumTeam

            System.out.println(Arrays.toString(eachGroup));

            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }

        }


    }

}
