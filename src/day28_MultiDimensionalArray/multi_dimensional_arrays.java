package day28_MultiDimensionalArray;

import java.util.Arrays;

public class multi_dimensional_arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        //            0  1
        int[] arr2 = {3, 4, 5, 6, 7};
        //             0  1  2  3  4
        int[] arr3 = {8, 9, 10, 11, 12, 13};
        //            0  1   2   3   4   5

//      int[][] arrays = { {1, 2}, {3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13} };
        int[][] arrays = {arr1, arr2, arr3};

        //  retrieve the element: 6
        System.out.println(arrays[1][3]);   // 6


        // retrieve the element: 8;
        System.out.println(arrays[2][0]);   // 8


        // retrieve the element: {3, 4, 5, 6, 7};;
        System.out.println(arrays[1]);   // return array
        System.out.println(Arrays.toString(arrays[1]));   // [3, 4, 5, 6, 7]

        //  Print entire arrays:
        System.out.println(Arrays.toString(arrays)); // return array
        System.out.println(Arrays.deepToString(arrays));    // {1, 2}, {3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13}


        System.out.println("===============================================================");

        String[][] groupName = {{"Pirlo", "Gattuso", "Kaka"}, {"Puyol", "Xavi", "Ronaldinho"}, {"Zidan", "Beckham", "Casilas"},};


        for (int i = 0; i < groupName.length; i++) {    // i: index numbers of 1D arrays

            //System.out.println(Arrays.deepToString(groupName[i]));

            String[] eachGroup = groupName[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {    //  j: index numbers of elements of each 1D arrays
                System.out.println(eachGroup[j]);
                //System.out.println(groupName[i][j]);
            }

        }


        System.out.println("===============================================================");


        for (int i = groupName.length - 1; i >= 0; i--) {
            // System.out.println(Arrays.deepToString(groupName[i]));

            String[] reversedEachGroup = groupName[i];
            System.out.println(Arrays.toString(reversedEachGroup));

            for (int j = reversedEachGroup.length - 1; j >= 0; j--) {
                System.out.println(reversedEachGroup[j]);
            }


        }


    }
}
