package ru.job4j.array;

/**
 * Классический поиск перебором
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 06.07.2018
 */
public class FindLoop {
    public int indexOf(int[]data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for(int index = 0; index <= el; index++) {
            if(data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}