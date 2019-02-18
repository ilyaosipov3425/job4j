package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс SortUser - сортирует user по возрасту в порядке возрастания
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.02.2019
 * @version $Id$
 */

public class SortUser {

    public Set<User> sort(List<User> users) {
        Set<User> userSort = new TreeSet<>();
        userSort.addAll(users);
        return userSort;
    }
}
