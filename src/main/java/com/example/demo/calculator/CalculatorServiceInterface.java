package com.example.demo.calculator;


public interface CalculatorServiceInterface {
    String hello();
    String error();
    int sumNum(int int1, int int2);
    int minusNum(int int1, int int2);
    int multiplyNum(int int1, int int2);
    int divideNum(int int1, int int2) throws ArithmeticException;
}