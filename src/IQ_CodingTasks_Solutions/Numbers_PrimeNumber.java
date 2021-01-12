package IQ_CodingTasks_Solutions;

public class Numbers_PrimeNumber {
}

/*
    Write a method that can check if a number is prime or not



Solution:

public static boolean primeNumber(int num) {
    if(num < 2) return false;

    for(int i = 2; i < num; i++) {

        if(num % i == 0) {
            return false;
        }
    }

    return true;

}
 */