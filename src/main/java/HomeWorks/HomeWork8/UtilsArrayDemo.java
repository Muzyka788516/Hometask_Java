package HomeWorks.HomeWork8;

public class UtilsArrayDemo {
    public static void main(String[] args) {
        String[] stringArray = {"один","два","три","четыре","пять"};

        System.out.println("Изначальный массив: ");

        for (String element : stringArray){
            System.out.println();

            UtilsArray.reverseArray(stringArray);

            System.out.println("Массив после замены: ");

            for (String elements : stringArray){
                System.out.println(elements + " ");
            }
        }
    }
}
