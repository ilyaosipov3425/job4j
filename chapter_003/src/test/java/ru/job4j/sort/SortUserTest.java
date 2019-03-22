package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс SortUserTest - тестирует сортировку user
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.02.2019
 * @version $Id$
 */

public class SortUserTest {
    private SortUser sortUser = new SortUser();

    @Test
    public void whenSortUsersToAge() {
        List<User> users = List.of(
                new User("Ilya", 26),
                new User("Anna", 25),
                new User("Ivan", 18),
                new User("Nick", 38)

        );
        Set<User> result = sortUser.sort(users);
        assertThat(result.iterator().next().getName(), is("Ivan"));
    }

    @Test
    public void whenSortUsersToAge2() {
        List<User> users = List.of(
                new User("Ilya", 15),
                new User("Anna", 25),
                new User("Ivan", 18),
                new User("Stas", 45),
                new User("Nick", 38)
        );
        Set<User> result = sortUser.sort(users);
        assertThat(result.iterator().next().getName(), is("Ilya"));
    }

    @Test
    public void whenUsersSortNameLength() {
        List<User> users = Arrays.asList(
                new User("Сергей", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Иван", 25),
                new User("Алексей", 40),
                new User("Алексей", 15)
        );
        List<User> result = sortUser.sortNameLength(users);
        assertThat(result.iterator().next().getName(), is("Иван"));
    }

    @Test
    public void whenUsersSortByAllFields() {
        List<User> users = Arrays.asList(
                new User("Сергей", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Иван", 25),
                new User("Алексей", 40),
                new User("Алексей", 15)
        );
        List<User> result = sortUser.sortByAllFields(users);
        assertThat(result.iterator().next().getName(), is("Алексей"));
    }
}