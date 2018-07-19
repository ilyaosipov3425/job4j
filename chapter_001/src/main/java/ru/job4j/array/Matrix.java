package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.07.2018
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
