package ru.job4j.list;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест конвертациии ArrayList в двухмерный массив
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 10.02.2019
 * @version $Id$
 */

public class ConvertList2ArrayTest {
    private ConvertList2Array list = new ConvertList2Array();

    @Test
    public void when7ElementsThen9() {
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when6ElementsThen9() {
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {0, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenConvertListArraysToListInteger() {
        ConvertList2Array convertList = new ConvertList2Array();
        List<int[]> list = List.of(
                new int[]{1, 2},
                new int[]{3, 4, 5, 6}
        );
        List<Integer> result = convertList.convert(list);
        List<Integer> expect = List.of(
                1, 2, 3, 4, 5, 6
        );
        assertThat(result, is(expect));
    }
}