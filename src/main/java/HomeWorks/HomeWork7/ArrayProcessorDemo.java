package HomeWorks.HomeWork7;

public class ArrayProcessorDemo {
    public static void main(String[] args) {
        int sizeArray = 8;
        ArrayProcessor treatment = new ArrayProcessor(sizeArray);

        System.out.println("Исходный массив: ");
        treatment.autputArray();


        System.out.println("Измененный массив: ");
        treatment.autputArray();


    }
}
