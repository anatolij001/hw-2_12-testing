package ru.sidorov.an.hw22.testing.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.sidorov.an.hw22.testing.exception.ZeroDivideException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.sidorov.an.hw22.testing.CalculatorConstants.*;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectPlus(int num1, int num2) {
        int result = service.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectPlus2(int num1, int num2) {
        int result = service.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMinus(int num1, int num2) {
        assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMinus2(int num1, int num2) {
        assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMultiply2(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectDivide2(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }



    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, ONE)
        );
    }
}