package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс School - делит учеников на группы
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.03.2019
 * @version $Id$
 */

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
         return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
}