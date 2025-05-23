package com.example.watch.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String hello() {
        return "<b>Watch demo calculator</b>";
    }

    public String error() {
        return "<b>Ошибка новичка</b>";
    }

    public int sumNum(int int1, int int2) {
        return int1 + int2;
    }

    public int minusNum(int int1, int int2) {
        return int1 - int2;
    }


    public int multiplyNum(int int1, int int2) {
        return int1 * int2;
    }

    public int divideNum(int int1, int int2) throws ArithmeticException {
        if (int2 == 0) {
            throw new ArithmeticException("А ты знал, что на 0 нельзя делить");
        }
        return int1 / int2;
    }
}

