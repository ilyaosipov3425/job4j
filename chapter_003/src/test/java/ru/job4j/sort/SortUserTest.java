package ru.job4j.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс SortUserTest - тестирует сортировку user
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.02.2019
 * @version $Id$
 */

public class SortUserTest {
    @Test
    public void whenSortUsersToAge() {
        SortUser sortUser = new SortUser();
        List<User> users = Arrays.asList(
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
        SortUser sortUser = new SortUser();
        List<User> users = Arrays.asList(
                new User("Ilya", 15),
                new User("Anna", 25),
                new User("Ivan", 18),
                new User("Stas", 45),
                new User("Nick", 38)
        );
        Set<User> result = sortUser.sort(users);
        assertThat(result.iterator().next().getName(), is("Ilya"));
    }
}
