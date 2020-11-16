package day30_ReturnMethods;

import library.string_utility;
import library.array_utility;

import java.util.Arrays;


public class method_calls {

    public static void main(String[] args) {
        String str = "Level";

        String reversedName = string_utility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));


        String str2 = "aaabbbbbccccccdddddeeeeee";

        String result2 = string_utility.removeDuplicates(str2);
        System.out.println(result2);

        String str3 = "aabcccdeee";

        String result3 = string_utility.unique(str3);
        System.out.println(result3);

        System.out.println("==========================================");

        int[] array = {1, 0, -2, 30, 40, 500, -20, -50};

        int[] descending = array_utility.sort(array);

        System.out.println(Arrays.toString(descending));
        System.out.println(array_utility.printArray(descending));

        System.out.println("==========================================");

        String s1 = "cccccccccccccbbbbbbbbbbbbaaaaaaaaaaa";
        String s2 = "bbbbbbbbbbbbaaaaaaaaaaac";

        boolean r1 = string_utility.isAnagram(s1, s2);
        System.out.println(r1);


    }

}
