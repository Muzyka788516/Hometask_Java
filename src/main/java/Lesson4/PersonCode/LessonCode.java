package Lesson4.PersonCode;

public class LessonCode {
    public static void main(String[] args) {

        Person personOne = new Person();

        personOne.name = "Ruslan";
        personOne.age = 29;
        personOne.town = "Berlin";

        personOne.greeting();


        Person personTwo = new Person();

        personTwo.name = "Olga";
        personTwo.age = 21;
        personTwo.town = "Paris";

        personTwo.greeting();
        String resultFromMethod = personOne.fromTown();
        System.out.println(resultFromMethod);



        System.out.println(personTwo.fromTown());

        System.out.println("Age of the second person is " + personTwo.age);














    }
}
