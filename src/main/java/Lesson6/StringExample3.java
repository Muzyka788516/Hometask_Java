package Lesson6;

public class StringExample3 {

    public static void main(String[] args) {

        String text1 = "Java  is a progtamming language ";
        String text2 = "Java is a progtamming language ";

        System.out.println(text2);


        text2 = text2 + "!";

        System.out.println(text2);

        int textLength = text2.length();

        System.out.println(text2.charAt(textLength -1));

        System.out.println(text2.substring(0,20));
    }


}
