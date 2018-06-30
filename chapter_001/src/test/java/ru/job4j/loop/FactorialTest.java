package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест расчета факториала
 * @author Osipov Ilya
 * @version $Id$
 * @since 30.06.2018
 */
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial sum = new Factorial();
        int result = sum.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial sum = new Factorial();
        int result = sum.calc(0);
        assertThat(result, is(1));
    }
}