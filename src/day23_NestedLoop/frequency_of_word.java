package day23_NestedLoop;

public class frequency_of_word {

    public static void main(String[] args) {

        String sentence = "Java is programing language, I like to learn Java";
                        //  " is a programing language, i like to learn java"
                            //   " is a programing language, i like to learn"
        String word = "Java";

        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, ""); // we need to remove one at a time to count;
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);

    }
}

/*
FrequencyOfWord
	1. write a program that can return the frequncy of the a word from the sentence
		Ex:
			sentence = "Java is a programming language, I like to learn Java";
			word = "Java";
			output:
				2
				sentence.contains(Java)
 */