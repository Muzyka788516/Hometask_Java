package Lesson8;

public class Kitchen {

    public static void main(String[] args) {

        Multivarka multivarka = new Multivarka();

        multivarka.dry();

        // System.out.println(multivarka.timeToTheCooking()); - 1 вариант
        // Сохранить результат работы метода в какой то переменной.

        int timeToTheEnd = multivarka.timeToTheCooking();
        System.out.println(" Время до завершения готовки : " + timeToTheEnd);

    }

}
