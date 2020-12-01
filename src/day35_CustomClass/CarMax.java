package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus", "RX", "White", 2021, 80000);
        //car1.getInfo();

        car2.setInfo("Mercedes", "E350", "Black", 1991, 10000);
        //car2.getInfo();

        car3.setInfo("Toyota", "Camry", "Grey", 1990, 20000);
        //car3.getInfo();

        car4.setInfo("BMW", "M5", "Red", 2021, 130000);
        //car4.getInfo();

        car5.setInfo("Volvo", "XC60", "Black", 2021, 100000);
        //car5.getInfo();

        Car[] cars = {car1, car2, car3, car4, car5};

        for (Car eachCar : cars) {
            eachCar.getInfo();
        }

        System.out.println("\n=====================\t\t=========================\n");

        ArrayList<Car> carList = new ArrayList<>();

        carList.addAll(Arrays.asList(cars));

        carList.removeIf(p -> p.price < 25000);  // we removed all the cars that are under 25k

        for(int i = 0; i <= carList.size()-1; i++){
            carList.get(i).getInfo();
        }



    }
}
