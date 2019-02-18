package ru.job4j.sort;

/**
 * Класс User - модель user, реализвация интерфейса Comparable
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.02.2019
 * @version $Id$
 */

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.getAge());
    }
}
