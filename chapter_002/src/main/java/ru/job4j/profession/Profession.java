package ru.job4j.profession;

/**
 * Класс Профессии
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Profession {
    public String name;

    public Profession() {
    }

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
