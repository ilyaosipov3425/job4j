package ru.job4j.profession;

/**
 * Класс Инженер
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Engineer extends Profession {
    public String buildHouse;

    public Engineer(String buildHouse) {
        this.buildHouse = buildHouse;
    }

    public String getBuildHouse() {
        return this.buildHouse;
    }
}
