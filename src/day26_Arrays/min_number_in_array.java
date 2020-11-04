package day26_Arrays;

public class min_number_in_array {

    public static void main(String[] args) {

        int [] numbers = {13, 56, 877, 234, -9, 10};

        int min = numbers[0];

        for(int i = 0; i <= numbers.length-1; i++){

            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Min number: " + min);

        System.out.println("\n--------------------------\n");



        int[] num1 = {43,123,1231,345,345,234,12323};

        int min1 =num1[0];

        for(int j = num1.length-1; j>=0; j--){

            if(num1[j] < min){
                min1 = num1[j];
            }

        }

        System.out.println(min1);



    }
}
