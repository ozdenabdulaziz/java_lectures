package day42_Inheritance.AnimalTask;

public class Cat extends Animal{

    public Cat (String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color, size);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }



}
