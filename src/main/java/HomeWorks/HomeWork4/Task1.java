package HomeWorks.HomeWork4;

public class Task1 {

    public void print1(String inputString) {

        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

    }

    public boolean check(String inputString) {
        return inputString.contains("Java");

    }

    public String change(String inputString) {
        return inputString.replace("a", "o");
    }

    public String up(String inputString) {
        return inputString.toUpperCase();

    }

    public String down(String inputString) {
        return inputString.toLowerCase();

    }

    public String cut(String inputString) {
        return inputString.replace("Java", " ");

    }






    }