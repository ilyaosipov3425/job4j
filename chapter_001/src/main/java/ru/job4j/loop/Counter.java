package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапозоне
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $id$
 * @since 29.06.2018
 */
public class Counter {
    public int add(int start, int finish) {
        int start = 1; //начало диапазона
        int finish = 10; //конец диапазона
        int sum = 0;
        boolean b = true;
        for (start <= finish; start++) {
            if (start % 2 == 0)
                sum +=start; }
        return sum;
    }
}
