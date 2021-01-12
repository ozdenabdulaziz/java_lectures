package IQ_CodingTasks_Solutions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

        public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

            int[] result = new int[arr1.length + arr2.length];

            int i = 0;

            for(int each: arr1) {

                result[i] = each;

                i++;

            }

            for(int each: arr2) {

                result[i] =each;

                i++;

            }

            return result;

        }

    public static void main(String[] args) {

        int[] arr1 = {12,23,43};
        int[] arr2 = {13,45,75};

        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));

    }

}

/*



Solution:

public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

    int[] result = new int[arr1.length + arr2.length];

    int i = 0;

    for(int each: arr1) {

    result[i] = each;

    i++;

    }

    for(int each: arr2) {

    result[i] =each;

    i++;

    }

    return result;

    }
 */