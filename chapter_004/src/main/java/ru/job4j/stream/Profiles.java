package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс Profiles - содержит метод collect
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.03.2019
 * @version $Id$
 */

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .distinct()
                .sorted((a1, a2) -> (a1.equals(a2) ? 0 : a1.getCity().compareTo(a2.getCity())))
                .collect(Collectors.toList());
    }
}
