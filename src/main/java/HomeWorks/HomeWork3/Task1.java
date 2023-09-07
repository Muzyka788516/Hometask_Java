package HomeWorks.HomeWork3;

public class Task1 {
    public static void main(String[] args) {

        String text1 =  new String("I study Basic Java!");
        forString(text1);

        System.out.println(text1.charAt(17));
        System.out.println(text1.contains("Java"));
        System.out.println(text1.substring(0,14)+ "!");
        System.out.println(text1.replace("a", "o"));
        System.out.println(text1.toUpperCase());
        System.out.println(text1.toLowerCase());



    }

    static void forString (String a ) {
        System.out.println(a);





    }

}
