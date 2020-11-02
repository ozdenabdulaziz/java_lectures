package day26_Arrays;

public class palindrome_strings {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin"};

        int countPalindromes = 0;

        for (int j = 0; j <= names.length - 1; j++) {

            String original = names[j]; // Anna
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                countPalindromes++;
            }
            if (original.equalsIgnoreCase(reversed)) {
                countPalindromes++;
                System.out.println(original);
            }

        }
        System.out.println("countPalindromes = " + countPalindromes);


    }
}
