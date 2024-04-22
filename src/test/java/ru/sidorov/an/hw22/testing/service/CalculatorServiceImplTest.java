package ru.sidorov.an.hw22.testing.service;

import org.junit.jupiter.api.Test;
import ru.sidorov.an.hw22.testing.exception.ZeroDivideException;

import static org.junit.jupiter.api.Assertions.*;
import static ru.sidorov.an.hw22.testing.CalculatorConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();


    @Test
    void shouldReturnCorrectPlus() {
        int result = service.plus(ONE, TWO);
        assertEquals(ONE + TWO, result);
    }

    @Test
    void shouldReturnCorrectPlus2() {
        int result = service.plus(TWO, TWO);
        assertEquals(TWO + TWO, result);
    }

    @Test
    void shouldReturnCorrectMinus() {
        assertEquals(ONE - TWO, service.minus(ONE, TWO));
    }

    @Test
    void shouldReturnCorrectMinus2() {
        assertEquals(TWO - ONE, service.minus(TWO, ONE));
    }

    @Test
    void shouldReturnCorrectMultiply() {
        assertEquals(TWO * THREE, service.multiply(TWO, THREE));
    }

    @Test
    void shouldReturnCorrectMultiply2() {
        assertEquals(TWO * ONE, service.multiply(TWO, ONE));
    }

    @Test
    void shouldReturnCorrectDivide() {
        assertEquals(THREE / ONE, service.divide(THREE, ONE));
    }

    @Test
    void shouldReturnCorrectDivide2() {
        assertEquals(THREE / TWO, service.divide(THREE, TWO));
    }
    @Test
    void shouldReturnZeroDivideException(){
        assertThrows(ZeroDivideException.class, () -> service.divide(THREE, ZERO));
    }
}