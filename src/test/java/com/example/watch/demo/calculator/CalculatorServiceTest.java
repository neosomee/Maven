package com.example.watch.demo.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testSumNum() {
        assertEquals(8, calculatorService.sumNum(5, 3));
        assertEquals(-2, calculatorService.sumNum(-1, -1));
    }

    @Test
    public void testMinusNum() {
        assertEquals(2, calculatorService.minusNum(5, 3));
        assertEquals(-2, calculatorService.minusNum(-1, 1));
    }

    @Test
    public void testMultiplyNum() {
        assertEquals(15, calculatorService.multiplyNum(5, 3));
        assertEquals(0, calculatorService.multiplyNum(0, 99));
    }

    @Test
    public void testDivideNum() {
        assertEquals(2, calculatorService.divideNum(6, 3));
        assertEquals(-5, calculatorService.divideNum(-10, 2));
    }

    @Test
    public void testDivideNumByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divideNum(10, 0));
    }
}
