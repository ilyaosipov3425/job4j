package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация двумерного массива в ArrayList
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 12.02.2019
 * @version $Id$
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }

        }
        return list;
    }
}
