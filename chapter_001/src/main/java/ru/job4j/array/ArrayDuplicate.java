package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 * @author Osipov Ilya (mailto:bullet3425@yndex.ru)
 * @version $Id$
 * @since 23.07.2018
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int duplicate = array.length;
        for (int out = 0; out < duplicate; out++) {
            for (int in = out + 1; in < duplicate; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[duplicate - 1];
                    duplicate--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, duplicate);
    }
}
