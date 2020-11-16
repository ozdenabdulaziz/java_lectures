package day30_ReturnMethods;

import library.string_utility;


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

    }


}
