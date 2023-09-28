package HomeWorks.HomeWork8;

public class UtilsArray {

    public static void reverseArray (String[] array){

        int length = array.length;
        for (int i = 0; i < length / 2; i++){

            String  temp = array[i];
            array [i] = array [length -1 -i];
            array[length -1 -i] = temp;

        }
    }
}
