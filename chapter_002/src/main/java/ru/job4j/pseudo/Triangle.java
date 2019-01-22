package ru.job4j.pseudo;

/**
 * Класс Triangle - треугольник
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 22.01.2019
 * @version $Id$
 */

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder tr = new StringBuilder();
        tr.append("   +   ");
        tr.append("  +++  ");
        tr.append(" +++++ ");
        tr.append("+++++++");
        return tr.toString();
    }
}
