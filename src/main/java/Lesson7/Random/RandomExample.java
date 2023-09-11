package Lesson7.Random;

public class RandomExample {
    public static void main(String[] args) {

       double random1 =  Math.random();

        System.out.println(random1);

        /*
        получить случайное целое число в диапазоне от min до max

        min + Math.random() * (max - min +1)

        min = 0, max = 100

        0 + random * (100 - 0 + 1) ->
        если рандом = 0 ->  значение будет 0


         */
        System.out.println((int) (random1 * 100 + 1));

        double random2 = Math.random() * (50- 10 + 1) +10;
        System.out.println((int)  random2);
    }
}
