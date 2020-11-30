package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
        String result = "";            //  A3B2C1D4E3


        ArrayList<String> list = new ArrayList<>(); // in order t be able to use frequency method

        for (String each : str.split("")) { // we get every character from str and add them into arraylist so that we can ise frequency method
            list.add(each);
        }


        for (String each : list) {
            int frequency = Collections.frequency(list, each);

            if (!result.contains(each)) { // to avoid duplicated characters in the result
               continue;
            }
            result += each + frequency;

        }

        System.out.println(result);


    }

}
