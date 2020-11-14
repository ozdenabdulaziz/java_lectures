package day29_Methods;

public class Methods_without_parameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("G.Ronaldo");
        printHello5Times();
        System.out.println("Juventus");
        printHello5Times();


        Methods_without_parameters.printHello5Times();

        Methods_without_parameters_2.printOddNumbers1To100();
        Methods_without_parameters_2.printEvenNumbers1To100();

    }


//  			AccessModifier specifier	returnTYPE	MethodName	(Parameter) { }

    public static void printHello5Times() {

        for(int i =0; i <=5; i ++){
            System.out.println("Hello");

        }
    }


}
