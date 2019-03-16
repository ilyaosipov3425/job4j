package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

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
