package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест конвертации двумерного массива в ArrayList
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 12.02.2019
 * @version $Id$
 */

public class ConvertMatrix2ListTest {
    private ConvertMatrix2List list = new ConvertMatrix2List();
    @Test
    public void when2on2ArrayThenList4() {
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when2on2ArrayThenList6() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when2on2ArrayThenList() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
