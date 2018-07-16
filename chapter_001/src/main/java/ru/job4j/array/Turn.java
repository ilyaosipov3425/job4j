package ru.job4j.array;

/**
 * Программа переворачивающая массив
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 08.07.2018
 */
public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int input = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = input;
        }
        return array;
    }
}