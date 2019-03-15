package ru.job4j.stream;

import java.util.Objects;

/**
 * Класс Student - содержит общий бал студентов
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.03.2019
 * @version $Id$
 */

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString() {
        return "Student{"
                + "score = " + score
                + '}';
    }
}