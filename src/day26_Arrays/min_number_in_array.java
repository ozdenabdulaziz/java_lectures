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

    }
}
