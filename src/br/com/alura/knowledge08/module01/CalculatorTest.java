package br.com.alura.knowledge08.module01;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.sum(3, 7);
        System.out.println(sum);

        sum = calc.sum(3, 0);
        System.out.println(sum);

        sum = calc.sum(0, 0);
        System.out.println(sum);

        sum = calc.sum(3, -1);
        System.out.println(sum);
    }
}
