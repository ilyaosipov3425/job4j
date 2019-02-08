package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест телефоного справочника
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 08.02.2019
 * @version $Id$
 */

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        List<Person> persons = phones.find("Ilya");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        List<Person> persons = phones.find("Osipov");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindByNumber() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        List<Person> persons = phones.find("534782");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ilya", "Osipov", "534782", "Pskov")
        );
        List<Person> persons = phones.find("Pskov");
        assertThat(persons.iterator().next().getSurname(), is("Osipov"));
    }
}
