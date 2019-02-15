package ru.job4j.list;

import java.util.List;

/**
 * Конвертация ArrayList в двухмерный массив
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 10.02.2019
 * @version $Id$
 */

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = rows;
        if (cells * rows < list.size()) {
            cells++;
        }
        int i = 0;
        int j = 0;

        int[][] array = new int[rows][cells];
        for (int index : list) {
            array[i][j] = index;
            if (j < cells - 1) {
                j++;
            } else {
                j = 0;
                i++;
            }
        }
        return array;
    }
}
