package IQ_CodingTasks_Solutions;

public class String_Remove_Duplicate {

    /*
            Write a return method that can remove the duplicated values from String

            Ex:  removeDup("AAABBBCCC")  ==> ABC


     */

    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBCCCADADDAAAA"));

    }





}

/*
    Solution 1:

                    public static  String  removeDup( String  str) {

                    String result = "";

                        for (int i = 0; i < str.length(); i++)

                            if (!result.contains("" + str.charAt(i)))

                            result += "" + str.charAt(i);



                        return result;

                    }



Solution 2:

                    public static String removeDup(String str) {

                    str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

                    str = str.replace(", " ,  "" ).replace("[","").replace("]","");

                        return  str;

                    }
 */