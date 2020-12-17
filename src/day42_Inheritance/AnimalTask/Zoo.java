package day42_Inheritance.AnimalTask;

public class Zoo {      // Zoo HAS A Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("King Of Jungle", "Bengal Tiger", 'M',5,"Orange", "Large");

        System.out.println(tiger);

        tiger.eat("Chicken");

        // tiger.meow();
        // tiger.bark();

        tiger.hunt();
        tiger.roar();

        System.out.println("==============================================================");

        Cat cat = new Cat("Reşo", "British Short Hair",'M',1,"Black/Gray","L");

        System.out.println(cat);

        cat.eat("Fish");
        cat.meow();
        cat.drink("Milk");
        cat.sleep();

        System.out.println("==============================================================");

        Dog dog = new Dog("Husky001","Siberian Husky",'F',2,"White","L");
        System.out.println(dog);
        dog.eat("Chicken");
        dog.drink("Water");
        dog.sleep();
        dog.bark();
    }
}
