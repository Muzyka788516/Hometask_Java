package Lesson4.CalculatorCode;

public class CalculatorWithParamDemo {

    public static void main(String[] args) {

        CalculatorWithParameters calculator = new CalculatorWithParameters();

        System.out.println("Результат сложения : " + calculator.add(1000.5, 400.1) );

        double parameter1 = 500.5;
        double parameter2 = 100.5;
        System.out.println("Результат вычитания : " + calculator.sub(parameter1,parameter2));

    }
}
