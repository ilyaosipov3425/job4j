package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Класс ListCompare - реализация компаратора для сравнения двух массивов символов
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 19.02.2019
 * @version $Id$
 */

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int first = left.length();
        int second = right.length();
        int min = Math.min(first, second);
        for (int i = 0; i < min; i++) {
            char firstChar = left.charAt(i);
            char secondChar = right.charAt(i);
            if (firstChar != secondChar) {
                result = Character.compare(firstChar, secondChar);
            }
        }
        if (result == 0) {
            result = Integer.compare(first, second);
        }
        return result;
    }
}
