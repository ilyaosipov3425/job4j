package ru.job4j.max;

/**
 * Max
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 23.06.2018
 */
public class Max {

    public int max(int first, int second) {
        return second > first ? second : first;
    }
     public int max(int first, int second, int third) {
        int temp = max(first, second) > int third || max(first, second) < int third;
        return temp;
    }
}