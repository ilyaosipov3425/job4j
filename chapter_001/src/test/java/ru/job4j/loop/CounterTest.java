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
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}