package Lesson4.CatCode;

public class Cat {

    String name;
    int age;


    String breed;

    public Cat(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public Cat( int age, String breed){
        this.age = age;
        this.breed = breed;

    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }




    public Cat(String name) {
        this.name = name;
    }



    public Cat(int age) {
        this.age = age;
    }
}