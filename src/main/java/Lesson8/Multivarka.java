package Lesson8;

import java.util.Random;

public class Multivarka {

    void dry (){

        System.out.println("Cooking");

    }

    public int timeToTheCooking(){
        Random random = new Random();
        int time = random.nextInt(60);
        //......
        //..... могут быть другие данные
        return  time;


    }
}
