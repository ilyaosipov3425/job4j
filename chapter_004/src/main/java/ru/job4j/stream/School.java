package ru.job4j.stream;

import java.util.List;
import java.util.Map;
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

    Map<String, Student> collectMap(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(
                        student -> student.getName(),
                        student -> student
                ));
    }
}