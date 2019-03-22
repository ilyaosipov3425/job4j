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
    private UserConvert userConvert = new UserConvert();
    private List<User> list = List.of(
            new User(0, "TestName1", "TestCity1"),
            new User(1, "TestName2", "TestCity2"),
            new User(2, "TestName3", "TestCity3")
    );

    @Test
    public void whenConvertListToMap() {
        HashMap<Integer, User> result = userConvert.process(list);
        assertThat(result.get(0), is(list.get(0)));
    }

    @Test
    public void when2ConvertListToMap() {
        HashMap<Integer, User> result = userConvert.process(list);
        assertThat(result.get(1), is(list.get(1)));
    }
}
