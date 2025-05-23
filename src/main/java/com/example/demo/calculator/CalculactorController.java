package com.example.demo.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculactorController {
    private final CalculatorService calculatorService;

    public CalculactorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumNum(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }
        try {
            return num1 + " + " + num2 + " = " + calculatorService.sumNum(num1, num2);
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String minusNum(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }
        try {
            return num1 + " - " + num2 + " = " + calculatorService.minusNum(num1, num2);
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyNum(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }
        try {
            return num1 + " * " + num2 + " = " + calculatorService.multiplyNum(num1, num2);
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/divide")
    public String divideNum(@RequestParam(value = "num1", required = false) Integer num1,
                            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }
        try {
            return num1 + " / " + num2 + " = " + calculatorService.divideNum(num1, num2);
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }
}