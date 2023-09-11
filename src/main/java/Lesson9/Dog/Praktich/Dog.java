package Lesson9.Dog.Praktich;

public class Dog {

    String dogName;
    int age;
    String  color;
    double weight;


    public Dog(String dogName, int age, String color, double weight) {
        this.dogName = dogName;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }


    public void happyBirthday() {
        this.age++;

    }



}



