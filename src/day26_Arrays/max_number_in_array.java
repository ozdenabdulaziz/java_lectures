package day26_Arrays;

public class max_number_in_array {

    public static void main(String[] args) {
        int[] numbers = {-300,200,300,-700,500,60,700};
        //               0 1;

        int max = numbers [0]; // 700

        for (int i = 0; i <= numbers.length-1; i++){

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max number: " + max);


    }
}
