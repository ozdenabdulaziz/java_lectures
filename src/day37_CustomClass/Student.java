package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa) {

        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear(); // Calculator to age.
        this.ID = ID;
        this.gpa = gpa;

    }

    public void getInfo() {
        System.out.println("Student name : " + name + "\nStudent ID   : " + ID + "\ngpa: " + gpa + "\nAge: " + age + "\nGender: " + gender);
    }

    @Override
    public String toString() {

        return
                "Name " + name +
                ", ID " + ID +
                ", Date Of Birth " + DOfB +
                ", Age " + age +
                ", Gender " + gender +
                ", GPA " + gpa;
    }
}

/*
        Student:
                   Attributes:
                                name, age, gender, ID

                   Actions:
                            setInfo
                            getInfo
                            study

 */