package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс FindAllItems - публикация всех заявок
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindAllItems implements UserAction {
    private int key;
    private String name;

    public FindAllItems(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items ------------");
        Item[] findAllItem = tracker.findAll();
        for (Item item : findAllItem) {
            System.out.println(item);
        }
        System.out.println("------------ End of list ------------");
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
