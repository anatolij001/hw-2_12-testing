package ru.sidorov.an.hw22.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sidorov.an.hw22.testing.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String calculator() {
        return "Добро пожаловать в <b>калькулятор</b>!" +
                "<p>Доступные страницы:</p>" +
                "<p>1) <a href=\"http://localhost:8080/calculator\">http://localhost:8080/calculator</p>" +
                "<p>2) <a href=\"http://localhost:8080/calculator/plus?num1=5&num2=5\">http://localhost:8080/calculator/plus?num1=5&num2=5</p>" +
                "<p>3) <a href=\"http://localhost:8080/calculator/minus?num1=5&num2=5\">http://localhost:8080/calculator/minus?num1=5&num2=5</p>" +
                "<p>4) <a href=\"http://localhost:8080/calculator/multiply?num1=5&num2=5\">http://localhost:8080/calculator/multiply?num1=5&num2=5</p>" +
                "<p>4) <a href=\"http://localhost:8080/calculator/divide?num1=5&num2=5\">http://localhost:8080/calculator/divide?num1=5&num2=5</p>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
            float result = calculatorService.divide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
    }
}
