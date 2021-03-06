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
        int i = data.length - 1;
        if (i > 0) {
            boolean input = data[0][0];
            result = true;
            for (int j = 0; j < i; j++) {
                if (input != data[j][j] || data[i][0] != data[i - j][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}