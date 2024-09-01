package com.kodilla.calculator;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addingResult = calc.add(4, 5);
        int subtractingResult = calc.subtract(9, 5);

        System.out.println("The result of adding: " + addingResult);
        System.out.println("The result of subtracting: " + subtractingResult);
    }
}
