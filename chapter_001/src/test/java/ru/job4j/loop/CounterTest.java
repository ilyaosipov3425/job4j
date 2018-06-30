package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 29.06.2018
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToThenThirty() {
        Counter sum = new Counter();
        int result = sum.add(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToThenFifty() {
        Counter sum = new Counter();
        int result = sum.add(5, 15);
        assertThat(result, is(50));
    }
}
