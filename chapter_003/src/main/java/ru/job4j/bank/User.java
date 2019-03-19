package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс User - содержит поля пользователя
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 11.03.2019
 * @version $Id$
 */

public class User {
    /**
     * name - имя пользователя
     * passport - паспорт пользователя
     */
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    @Override
    public String toString() {
        return "User{"
                + "name = " + name
                + "passport = " + passport
                + '}';
    }
}