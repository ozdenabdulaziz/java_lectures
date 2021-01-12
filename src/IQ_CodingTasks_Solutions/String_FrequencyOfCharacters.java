package IQ_CodingTasks_Solutions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters {

    //    Write a return method that can find the frequency of characters

//  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    public static String FrequencyOfChars(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ", "").replace("[", "").replace("]", "");

        String result = "";

        for (int j = 0; j < b.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.substring(i, i + 1).equals("" + str.charAt(j)))

                    count++;

            }

            result += b.substring(j, j + 1) + count;

        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("Abdulaziz OZDEN"));
    }
}


/*
solution 1:

public static String FrequencyOfChars(String str) {

String nonDup = "";

for(int i=0; i < str.length(); i++)

if(!nonDup.contains(""+str.charAt(i)))

nonDup+= ""+str.charAt(i);



String expectedResult = "";

for( int j=0;j < nonDup.length(); j++) {

int count = 0;

for(int i=0; i < str.length(); i++) {

if(str.charAt(i) == nonDup.charAt(j))

count++;

}

expectedResult +=nonDup.charAt(j)+"" + count;

}

return expectedResult;

}



solution 2:

public  static  String  FrequencyOfChars(String str) {

    String expectedResult = "";

    while (!str.isEmpty()) {

        int count = 0;

        for(int i=0; i < str.length(); i++) {

            if(str.charAt(i) == str.charAt(0)) {

                count++;

            }

        }

        expectedResult +=str.charAt(0)+"" + count;

        str = str.replace(""+str.charAt(0) ,  "" );

    }

    return expectedResult;

}



Solution 3:

public  static  String  FrequencyOfChars(String str) {

String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

  b = b.replace(", ","").replace("[","").replace("]","");

String result="";

for(int j=0; j<b.length();j++) {

int count=0;

for(int i=0; i<str.length(); i++){

if(str.substring(i, i+1).equals(""+str.charAt(j)))

count++;

}

result+=b.substring(j, j+1)+count;

}

return result;

}



Solutions 4:

public static String frequency(String str) {

String nonDup="", result="";

for(int i=0; i < str.length(); i++)

if(! nonDup.contains(""+str.charAt(i)))

nonDup += ""+str.charAt(i);



for(int i=0; i < nonDup.length(); i++) {

int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

result += ""+nonDup.charAt(i) + num;

}



return result;

}
 */