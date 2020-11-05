package day27_ForEachLoop;

public class for_each_loop {

    public static void main(String[] args) {

        String[] names = {"Totti", "Del Piero", "Juninho", "Buffon", "Kaka"};

        for (int i = 0; i < names.length; i++) {    // i is the index number
            System.out.println(names[i]);
        }

        System.out.println("============================================");

        for (String each : names) {     // each is the element
            System.out.println(each);
        }


        System.out.println("============================================");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int countEvens = 0;
        int countOdd = 0;

        for(int each : numbers){    // each is the elements of the array

            if(each % 2 == 0){
                countEvens++;
            }else{
                countOdd++;
            }
        }

        System.out.println("countEvens = " + countEvens);
        System.out.println("countOdd = " + countOdd);

        System.out.println("============================================");

        int[] scores = {10, 2, 3, 25, 100, -5, -2, 1000, 30, 40, 56};

        int max = scores[0];
        int min = scores[0];

        for(int each : scores){

            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
















    }
}
