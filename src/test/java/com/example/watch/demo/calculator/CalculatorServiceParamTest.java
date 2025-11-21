package com.example.watch.demo.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    static Stream<Arguments> sumProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-5, 5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("sumProvider")
    void testSumNum(int a, int b, int expected) {
        assertEquals(expected, calculatorService.sumNum(a, b));
    }

    static Stream<Arguments> minusProvider() {
        return Stream.of(
                Arguments.of(10, 7, 3),
                Arguments.of(2, 5, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("minusProvider")
    void testMinusNum(int a, int b, int expected) {
        assertEquals(expected, calculatorService.minusNum(a, b));
    }

    static Stream<Arguments> multiplyProvider() {
        return Stream.of(
                Arguments.of(3, 4, 12),
                Arguments.of(0, 100, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyProvider")
    void testMultiplyNum(int a, int b, int expected) {
        assertEquals(expected, calculatorService.multiplyNum(a, b));
    }

    static Stream<Arguments> divideProvider() {
        return Stream.of(
                Arguments.of(8, 2, 4),
                Arguments.of(-9, 3, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("divideProvider")
    void testDivideNum(int a, int b, int expected) {
        assertEquals(expected, calculatorService.divideNum(a, b));
    }

    @Test
    void testDivideNumThrows() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divideNum(5, 0));
        assertTrue(exception.getMessage().contains("нельзя делить"));
    }
}
