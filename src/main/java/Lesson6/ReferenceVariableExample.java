package Lesson6;

import java.util.concurrent.Callable;

public class ReferenceVariableExample {
    public static void main(String[] args) {

        Cat cat1 = new Cat(2);

        Cat cat2 = cat1;

        System.out.println(cat2.age);

        cat1.age = 3;

        System.out.println(cat2.age);

        Cat cat3 = new Cat(4);

        System.out.println(cat3.age);





    }


}
