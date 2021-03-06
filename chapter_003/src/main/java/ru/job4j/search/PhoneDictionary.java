package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * PhoneDictionary - телефоный справочник
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 07.02.2019
 * @version $Id$
 */

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей , который содержит key в любых полях.
     * @param key - ключ поиска
     * @return - список подходящих пользователей
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
