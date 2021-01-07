package day46_JavaRecap.CarTask;

public class CarMax {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("E 350", "Black", 2021, 75000);

        Lexus lexus = new Lexus("RX 350", "White", 2021, 100000);

        BMW bmw = new BMW("M5","Black",2021, 175000);

        Tesla tesla = new Tesla("Y", "Blue",2021,150000);


        System.out.println("---------------------------------------------------------");

        mercedes.start();

        lexus.start();

        bmw.start();

        tesla.start();


        System.out.println("---------------------------------------------------------");

        mercedes.drive();

        lexus.drive();

        bmw.drive();

        tesla.drive();

        System.out.println("---------------------------------------------------------");

        bmw.autoPark();

        tesla.autoPilot();



    }
}
