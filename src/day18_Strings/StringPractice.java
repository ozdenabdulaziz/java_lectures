package day18_Strings;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2);   //true

        String s3 = new String("Cat");

        System.out.println(s1 == s3);   //false
        System.out.println(s2 == s3);   // false

        String s4 = new String("Cat");

        System.out.println(s3 == s4);   // false

        //  equals()
        System.out.println(s1.equals(s3));  // true
        System.out.println(s2.equals(s3));  // true
        System.out.println(s3.equals(s4));  // true

        String s5 = new String("cat");

        System.out.println(s4.equals(s5)); // false, because --> equals method is case sensitive.
        System.out.println(s4.equalsIgnoreCase(s5)); // true, because --> equalsIgnoreCase is not case sensitive.


        System.out.println("\n------------------------\t---------------------------\n");

        String str = "cybertek";
            str = str.toUpperCase();   // it wil be "CYBERTEK";

        System.out.println(str);

              str = str.toLowerCase();  // it's created new str "cybertek"

        System.out.println(str);

        System.out.println("\n------------------------\t---------------------------\n");

        String name = "SpaceX or Tesla"; //15 character with space

        System.out.println(name.length()); // calculator how many characters in my name.

        int n1 = name.length();

        System.out.println(n1); // second way for the calculator your name characters.

        String name2 = "Tesla";
        int n2 = name2.length();
        System.out.println(n2); // have 5 index but last index it's will be 4. because starting from 0.

        int lastIndex = name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("\n------------------------\t---------------------------\n");

        String a = "Java Programing Language";

        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);

        System.out.println("\n------------------------\t---------------------------\n");

        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-1-1); // you can give -2 or twice time -1 -1;

        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);


    }
}
