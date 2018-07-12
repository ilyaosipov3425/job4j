package ru.job4j.array;

/**
 * Массив true, false
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 09.07.2018
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int i = data.length;
        if(i > 0) {
            boolean input = data[0];
            result = true;
            for(int x = 0; x < i; x++) {
                if(data[x] != input) {
                    result = false;
                }
            }
        }
        return result;
    }
}