package day26_Arrays;

//  import java.util.*;

import java.util.Arrays;

public class arrays_utility {

    public static void main(String[] args) {
        // Array.toString(); methods
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers);  // hashcode

        System.out.println(Arrays.toString(numbers));  // we will must use in the to print the entire array.
        //                  it's mandatory.

        System.out.println("\n------------------\t----------------------\n");

        String[] classMate = {"name1", "name2", "name3", "name4", "name4"};

        System.out.println(classMate);  // hashcode

        System.out.println(Arrays.toString(classMate));

        System.out.println(Arrays.toString(classMate));

        // sort(array)

        int[] arr1 = {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};

        Arrays.sort(arr1);  // does not return any value, cannot be assigned to a variable nor pass it in print statement

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: " + arr1[arr1.length - 1]);
        System.out.println("Min: " + arr1[0]);

        double[] arr2 = {1.5, 0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};

        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println("Second min number: " + arr2[1]);
        System.out.println("Second max number: " + arr2[arr2.length - 1 - 1]);

        //equals(arr1, arr2);

        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};

        Arrays.sort(a1);    //[1,2,3]
        Arrays.sort(a2);    //[1,2,3]

        boolean b1 = Arrays.equals(a1,a2);
        System.out.println(b1);






    }
}
