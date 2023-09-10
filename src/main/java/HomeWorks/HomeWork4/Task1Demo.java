package HomeWorks.HomeWork4;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String myString = "I study Basic Java!";
        System.out.println(myString);

        task1.print1(myString);

        boolean check = task1.check(myString);
        System.out.println("Содержит подстроку `Java`: " + check);

        String change = task1.change(myString);
        System.out.println("Строка после замены: " + change);

        String up = task1.up(myString);
        System.out.println("Строка в верхнем регистре: " + up);

        String down = task1.down(myString);
        System.out.println("Строка в нижнем регистре: " + down);

        String cut = task1.cut(myString);
        System.out.println("Строка после удаленя подстроки ´Java´: " + cut);






    }





}
