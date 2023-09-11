package Lesson7;

import Lesson4.PersonCode.Person;

public class PearsonDemo {
    public static void main(String[] args) {

        System.out.println();

        Pearson personOlga = new Pearson("Olga" , "Berlin");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);


        Pearson pearsonPetr = new Pearson("Petr" , "Frankfurt");
        System.out.println(pearsonPetr.name);
        System.out.println(pearsonPetr.town);

        System.out.println("повторно проверим Ольгу");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        Pearson.town = "KOLN";

        System.out.println(pearsonPetr.name);
        System.out.println(pearsonPetr.town);
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);







    }
}
