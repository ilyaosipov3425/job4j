package ru.job4j.list;

/**
 * Класс User
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.02.2019
 * @version $Id$
 */

public class User {
    private int id;
    private String name;
    private String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
