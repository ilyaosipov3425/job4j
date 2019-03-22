package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест телефоного справочника
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 08.02.2019
 * @version $Id$
 */

public class PhoneDictionaryTest {
    private PhoneDictionary phones = new PhoneDictionary();

    @Test
    public void whenFindByName() {
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        var persons = phones.find("Ilya");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindBySurname() {
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        var persons = phones.find("Osipov");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindByNumber() {
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        var persons = phones.find("534782");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindByAddress() {
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        var persons = phones.find("Pskov");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }
}
