package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetName = "Jhons Branch Dr";
        String cityName = "Mclean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber + " " + streetName + ",\n" + cityName + ' ' + state + ' ' + zipCode;

        System.out.println(fullAddress);

        System.out.println("=========================================================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int millage = 55000;
        double price = 22000;
        String color = "Red";

        // 2021 Volvo S90, 000 miles, Black color, $ 1250000.9

        String carInformation = year + " " + brand + ' ' + model + ", " + millage + " Miles, " + color + " Color, $" + price;

        System.out.println(carInformation);

    }


}
