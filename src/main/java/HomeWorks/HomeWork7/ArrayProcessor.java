package HomeWorks.HomeWork7;

import java.util.Random;

public class ArrayProcessor {

    private int [] array;
    public  ArrayProcessor(int size){
        array = new int[size];

        Random generator = new Random();
        for (int i = 0; i < size; i++){
            array[i] = generator.nextInt(50) + 1;

        }
    }

    public void autputArray(){
        for (int number : array){

            System.out.println(number + " ");
        }
}

}
