package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс ConvertMatrix - преобразование матрицы чисел в список чисел
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.03.2019
 * @version $Id$
 */

public class ConvertMatrix {

    public List<Integer> convert(Integer[][] list) {
        return Stream.of(list)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}