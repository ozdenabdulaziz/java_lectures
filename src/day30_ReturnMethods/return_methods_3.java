package day30_ReturnMethods;

import java.util.Arrays;

public class return_methods_3 {

    public static void main(String[] args) {

        System.out.println("===================Max==================");


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = max(array);   //9
        int max2 = max2(array);

        System.out.println("max = " + max);
        System.out.println("max2 = " + max2);

        System.out.println(max > 100);  // false
        //                  9

        System.out.println("===================Min==================");

        int[] minArray = {10, -2, -33, 40, 35, 16, 87, 18, -90};
        int min = min(minArray);
        System.out.println("min = " + min);


    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
        // do not giving any statement after return.
    }


    public static int max2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int min(int[] arr) {

        int min = arr[0];

        for (int each : arr){
            if (each < min){
                min = each;
            }
        }

        return min;
    }

}
