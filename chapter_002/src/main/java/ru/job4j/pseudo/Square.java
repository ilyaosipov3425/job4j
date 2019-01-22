package ru.job4j.pseudo;

/**
 * Класс Square - квадрат
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 22.01.2019
 * @version $Id$
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sq = new StringBuilder();
        sq.append("++++");
        sq.append("+     +");
        sq.append("+     +");
        sq.append("++++");
        return sq.toString();
    }
}
