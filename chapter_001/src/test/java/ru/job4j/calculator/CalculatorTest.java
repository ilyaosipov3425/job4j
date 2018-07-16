package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.calculator.Calculator.calc;

/**
 * Test
 *
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @since 17.06.2018
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractTreeMinusOneThenTwo() {
        calc = new Calculator();
        calc.subtract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoOnTwoThenOne() {
        calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTwoOnTwoThenFour() {
        calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}