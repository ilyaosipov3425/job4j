package ru.job4j.stream;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс ConvertMatrixTest
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.03.2019
 * @version $Id$
 */

public class ConvertMatrixTest {

    @Test
    public void whenConvertingMatrixToList() {
        ConvertMatrix convert = new ConvertMatrix();
        Integer[][] list = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = convert.convert(list);
        assertThat(result, is(expected));
    }

    @Test
    public void whenConvertingMatrixToList2() {
        ConvertMatrix convert = new ConvertMatrix();
        Integer[][] list = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        List<Integer> expected = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<Integer> result = convert.convert(list);
        assertThat(result, is(expected));
    }
}
