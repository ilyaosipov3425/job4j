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
        for(int i = 0; i < data.length; i++) {
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