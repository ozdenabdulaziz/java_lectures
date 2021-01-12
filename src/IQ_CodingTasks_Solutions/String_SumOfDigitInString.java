package IQ_CodingTasks_Solutions;

public class String_SumOfDigitInString {
//    Write a method that can return the sum of the digits in a string

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits("72Batman 01Adana"));

    }


}
/*
Solution:

public  static int  sumOfDigits(String s) {

  int total = 0;

char[] ch =  s.toCharArray();

for(char each: ch) {

if(Character.isDigit(each)) {

total += Integer.valueOf(""+each);

}

}

return total;

}

 */