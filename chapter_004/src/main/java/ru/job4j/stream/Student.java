package ru.job4j.stream;

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
}