package day23_NestedLoop;

public class cat_dog {

    public static void main(String[] args) {

        String sentence = "dog Dog dog Dog cat CAT Cat cAt";

        String temp = sentence.toLowerCase();   //  after this we do not need to worry case sensitivity

        int countDog = 0;
        while(temp.contains("dog")){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }

        System.out.println("Numbers of Dog = " + countDog);

        System.out.println("\n---------------------\t--------------------\n");

        int countCat = 0;

        while(temp.contains("cat")){
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("Numbers of Cat = " + countCat);

        System.out.println("\n---------------------\t--------------------\n");

        System.out.println(countCat == countDog);
        System.out.println(countCat != countDog);


    }
}
