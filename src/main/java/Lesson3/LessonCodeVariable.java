package Lesson3;

public class LessonCodeVariable {
    public static void main(String[] args) {

        int car1 = 1;
        int car2 = 2;
        //....


        Dog firstDog = new Dog();

        System.out.println(firstDog);

        firstDog.name = "Scharik";
        firstDog.breed = "Doberman";
        firstDog.color = "Blac";
        firstDog.isMale = true;
        firstDog.age = 2;
        firstDog.weight = 45.5;

        //======


        Dog secondDog = new Dog();

        System.out.println(secondDog);


        secondDog.name = "Barbos";
        secondDog.breed = "Pudel";
        secondDog.color = "Silver";
        secondDog.isMale = true;
        secondDog.age = 4;
        secondDog.weight = 15.5;

        System.out.println("собака номер один");
        System.out.println("Порода: " + firstDog.breed + ", Кличка:  " + firstDog.name);
        System.out.println("Возраст: " + firstDog.age);
        System.out.println("Цвет: " + firstDog.color);
        System.out.println("Пол собаки -  is male : " + firstDog.isMale);
        System.out.println("Вес: " + firstDog.weight);

        System.out.println("==========================================");


        System.out.println("собака номер два");
        System.out.println("Порода: " + secondDog.breed + ", Кличка:  " + firstDog.name);
        System.out.println("Возраст: " + secondDog.age);
        System.out.println("Цвет: " + secondDog.color);
        System.out.println("Пол собаки -  is male : " + secondDog.isMale);
        System.out.println("Вес: " + secondDog.weight);


        //===================================================================

        Dog dog3 = new Dog();

        System.out.println(dog3);

        dog3.name = "Muhtar";
        dog3.breed = "Doberman";
        dog3.color = "Blac";
        dog3.isMale = true;
        dog3.age = 2;
        dog3.weight = 45.5;

        //=======================================================================
        System.out.println("====================================================");

        Cat cat1 = new Cat();

        System.out.println();

        cat1.name = "Zevs";
        cat1.breed = "Sfinks";
        cat1.age = 8;
        cat1.color = "Braun";
        cat1.weight = 4;
        cat1.isMale = true;

        System.out.println("Имя: " + cat1.name );
        System.out.println("Порода: " + cat1.breed);
        System.out.println("Возраст: " + cat1.age);
        System.out.println("Цвет: " + cat1.color);
        System.out.println("Вес: " + cat1.weight);
        System.out.println("Пол кота - isMale : " + cat1.isMale);





    }
}
