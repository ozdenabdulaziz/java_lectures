package day04_Variables;

public class CalculateCircle {

    public static void main(String[] args) {
        // Radius(Yari capi)= 7.5
        double r = 7.5;
        double pi = 3.14;

        double area = r * r * pi;
        double perimeter = 2 * r * pi;

        System.out.println("Area of the circle is: ");
        System.out.println(area);

        System.out.println("Perimeter of the circle is: ");
        System.out.println(perimeter);


    }


}


/*
        Task03: CalculateCircle
	write a program that can calculate the area and permeter of the circle based on the given radius

			Hind: Area of circle = r * r * PI
				perimeter of circle = 2 * r * PI

 */