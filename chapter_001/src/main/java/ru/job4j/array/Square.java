package ru.job4j.array;

/**
 * Массив
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 05.07.2018
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for(int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}