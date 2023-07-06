package br.com.alura.knowledge08.module01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {
    //JUnit
    @Test
    public void sumTwoPositiveNumbers(){
        Calculator calc = new Calculator();
        int sum = calc.sum(3, 7);

        Assertions.assertEquals(10, sum);
    }
}
