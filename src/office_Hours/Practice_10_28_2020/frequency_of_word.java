package office_Hours.Practice_10_28_2020;

public class frequency_of_word {

    public static void main(String[] args) {
        String sentence = "Cat Cat Cat Cat Cat";
        String word = "Dog";

        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);


    }
}
