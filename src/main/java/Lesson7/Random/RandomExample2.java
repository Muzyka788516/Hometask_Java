package Lesson7.Random;

import java.util.Random;

public class RandomExample2 {
    public static void main(String[] args) {

        Random randomWithClass = new Random();
         int random1 = randomWithClass.nextInt();
        System.out.println(random1);

        int min = 10;
        int max = 50;
        int random2 = randomWithClass.nextInt(max - min);

        /*
        min + randomWithClass.nextInt(max - min)
         */



        // System.out.println(random2);



    }
}
