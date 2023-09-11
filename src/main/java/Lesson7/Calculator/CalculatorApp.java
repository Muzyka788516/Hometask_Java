package Lesson7.Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        System.out.println("Ведите целое число №1 для вычислений: ");

        Scanner scanner = new Scanner(System.in);
        int param1 = scanner.nextInt();

        System.out.println("введите цудое число  №2 для вычислений: ");
        int param2 = scanner.nextInt();



    }

}
