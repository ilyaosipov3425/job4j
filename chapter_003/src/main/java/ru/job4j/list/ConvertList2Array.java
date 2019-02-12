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
        int[][] array = new int[rows][cells];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (index >= list.size()) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = list.get(index++);
                }
            }
        }
        return array;
    }
}
