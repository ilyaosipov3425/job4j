package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @since 17.06.2018
 */
public class CalculatorTest{
    @Test
    public void whenAddOnePlusOneThenTwo(){
        Calculator.calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractTreeMinusOneThenTwo(){
        Calculator.calc = new Calculator();
        calc.subtract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoOnTwoThenOne(){
        Calculator.calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTwoOnTwoThenFour(){
        Calculator.calc = new Caclculator();
        calc.multiple(2D, 2D);
        double result = calc,getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}