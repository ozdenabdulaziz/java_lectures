package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        String str = new String("Barcelona");
        Student student1 = new Student();
        student1.setInfo("L.Messi", 'M', LocalDate.of(1991, 11, 01), "OF 10", 9.5);

        System.out.println(list.toString());
        System.out.println(str);

        System.out.println(student1.toString());
        System.out.println(student1);

        System.out.println("\n========================\t\t=================\n");

        Student student2 = new Student();
        student2.setInfo("Aziz", 'M', LocalDate.of(1991, 01, 11), "AO4099", 3.16 / 4);
        // student.getInfo(); ===> easy way

        //System.out.println(student2.toString());
        System.out.println(student2);

        System.out.println("\n========================\t\t=================\n");

        Student student3 = new Student();
        student3.setInfo("Reso", 'M', LocalDate.of(2020, 10, 04), "31567", 2.89);

        System.out.println(student3);

        System.out.println("\n========================\t\t=================\n");

        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(student1, student2, student3));

        System.out.println(studentsList);

        System.out.println("\n========================\t\t=================\n");

        Student[] students = {student1, student2, student3};

        System.out.println(Arrays.toString(students));

        System.out.println("\n========================\t\t=================\n");
        // find the stident who has OD of 'AO4099'

        for (Student each : students){
            if (each.ID.equals("OF 10")){
                System.out.println(each);
            }
        }

        System.out.println("\n========================\t\t=================\n");

        Student s1 = new Student();
        Student s2 = s1;
        // only one student will be create it



    }


}
