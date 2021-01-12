package IQ_CodingTasks_Solutions;

import office_Hours.Practice_10_28_2020.reverse;

public class String_Reverse {

    /*
                Write a return method that can reverse  String

                    Ex: Reverse("ABCD"); ==> DCBA

     */

    public static String Solution1(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }

        return reverse;
    }





    public static void main(String[] args) {

        System.out.println(Solution1("Hello World"));

        // Solution 2: Without a new Method

        String word1 = "Hello World";

        String result = "";

        for(int i = word1.length()-1; i>=0; i--){
            result += word1.charAt(i);
        }

        System.out.println("Result: " + result);

    }


}

/*

Solution 1

                                public static String StrReverse(String str) {

                                String reverse="";

                                for(int i=str.length()-1; i >= 0; i--)

                                reverse += str.toCharArray()[i];

                                return  reverse;

                                }



Solution 2

                public  static String  Reverse(String str) {

                return new StringBuffer(str).reverse().toString());

                }


 */