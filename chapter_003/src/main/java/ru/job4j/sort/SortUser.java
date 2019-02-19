package ru.job4j.sort;

import java.util.*;

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

    public List<User> sortNameLength(List<User> list) {
        list.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getName().length() > o2.getName().length() ? 1 : -1;
                    }
                }
        );
        return list;
    }

    public List<User> sortByAllFields(List<User> list) {
        list.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        int i = o1.getName().compareTo(o2.getName());
                        return i != 0 ? i : Integer.compare(o1.getAge(), o2.getAge());
                    }
                }
        );
        return list;
    }
}
