package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        System.out.println("\n--------------------\t\t--------------------\n");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(70);
        scores.add(50);
        scores.add(65);
        scores.add(75);

        Collections.sort(scores);

        System.out.println("Minimum Number: " + scores.get(0));
        System.out.println("Maximum Number: " + scores.get(scores.size() - 1));
        System.out.println(scores);

        Collections.swap(scores, 2, 3);
        System.out.println(scores); // switched 2 and 3 index numbers.

        Collections.swap(scores, 0, scores.size() - 1);
        System.out.println(scores);


        Collections.swap(scores, scores.indexOf(60), scores.lastIndexOf(70));
        //                     find 60 in the scores        find last 70 in the scores
        System.out.println(scores);

        System.out.println("\n-------------------------\t\t-----------------------\n");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('D');
        list.add('A');
        list.add('A');
        list.add('A');

/*
        for (int i = 0; i< list.size(); i++){

            char each = list.get(i);

            if(each == 'A'){
                list.set(i,'E');
            }


        }
*/

        Collections.replaceAll(list, 'A', 'E');

        System.out.println(list);


        System.out.println("\n-------------------------\t\t-----------------------\n");


        Collections.replaceAll(list, 'A', 'E');

        System.out.println(list);   // [    E, B, C, E, D, E, ,E, E]

        int frequencyOfE = Collections.frequency(list, 'E');
        System.out.println("frequencyOfE: " + frequencyOfE);

        System.out.println("\n-------------------------\t\t-----------------------\n");


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(1000);
        nums.add(20);
        nums.add(200);
        nums.add(2000);
        nums.add(10);

        int max = Collections.max(nums);
        System.out.println("Max: " + max);

        int min = Collections.min(nums);
        System.out.println("Min: " + min);


    }


}
