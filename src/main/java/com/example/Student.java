package com.example;

public class Student {
    // Private instance variables
    private String name;
    private int age;
    private static int count = 0; // static variable to keep track of student count

    // Constructor that initializes the name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Increment the student count
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Static function to get the student count
    public static int getCount() {
        return count;
    }

    // Object function to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
