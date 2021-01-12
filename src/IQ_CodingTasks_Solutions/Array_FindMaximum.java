package IQ_CodingTasks_Solutions;

public class Array_FindMaximum {

    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        System.out.println();

    }
}

/*

Array -- Find Maximum

Write a method that can find the maximum number from an int Array



Solution 1:

public static int maxValue( int[]  n ) {

int max = Integer.MIN_VALUE;

for(int each: n)

if(each > max)

max = each;



return max;

}



Solution 2:

public static int maxValue( int[]  n ) {

Arrays.sort( n );

return  n [ n.lenth-1 ];

}

 */