package IQ_CodingTasks_Solutions;

public class Array_FindMinimum {
}
/*
    Write a method that can find the maximum number from an int Array



Solution 1:

public static int maxValue( int[]  n ) {

int min = Integer.MAX_VALUE;

for(int each: n)

if(each < min)

min = each;



return min;

}



Solution 2:

public static int maxValue( int[]  n ) {

Arrays.sort( n );

return  n [ 0 ];

}

 */