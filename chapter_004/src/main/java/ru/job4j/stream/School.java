package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс School - делит учеников на группы
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.03.2019
 * @version $Id$
 */

public class School {
    /**
     * Метод делит учеников на группы по баллу
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
         return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    /**
     * Метод преобразует List в Map
     */
    Map<String, Student> collectMap(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(
                        student -> student.getName(),
                        student -> student
                ));
    }

    /**
     * Метод возвращает список студентов у которых балл больше bound
     */
    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .sorted(Student::compareTo)
                .flatMap(Stream::ofNullable)
                .takeWhile(student -> student.getScore() >= bound)
                .collect(Collectors.toList());
    }
}