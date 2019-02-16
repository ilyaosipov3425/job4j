package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс UserConvertTest - проверяет преобразование List в Map
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.02.2019
 * @version $Id$
 */

public class UserConvertTest {
    @Test
    public void whenConvertListToMap() {
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList<>();
        list.add(new User(0, "Ilya", "Pskov"));
        list.add(new User(1, "Ivan", "Moscow"));
        list.add(new User(2, "Petr", "Omsk"));
        HashMap<Integer, User> result = userConvert.process(list);
        assertThat(result.get(0), is(list.get(0)));
    }

    @Test
    public void when2ConvertListToMap() {
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList<>();
        list.add(new User(0, "Ilya", "Pskov"));
        list.add(new User(1, "Ivan", "Moscow"));
        list.add(new User(2, "Petr", "Omsk"));
        HashMap<Integer, User> result = userConvert.process(list);
        assertThat(result.get(1), is(list.get(1)));
    }
}
