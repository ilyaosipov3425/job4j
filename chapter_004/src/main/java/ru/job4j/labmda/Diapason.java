package ru.job4j.labmda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Класс Diapason - подсчёт функций в диапозоне
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 13.03.2019
 * @version $Id$
 */

public class Diapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rst = new ArrayList<>();
        for (double i = start; i != end; i++) {
            rst.add(func.apply(i));
        }
        return rst;
    }
}
