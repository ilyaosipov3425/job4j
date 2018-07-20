package ru.job4j.array;

/**
 * True || False по диагонали.
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.07.2018
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == j) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
