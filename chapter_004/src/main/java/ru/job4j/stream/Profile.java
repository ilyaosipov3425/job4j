package ru.job4j.stream;

/**
 * Класс Profile - профиль пользователя
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.03.2019
 * @version $Id$
 */

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
