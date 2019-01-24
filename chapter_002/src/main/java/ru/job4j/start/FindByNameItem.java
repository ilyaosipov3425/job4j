package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс FindByNameItem - поиск заявки по имени
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindByNameItem implements UserAction {
    private int key;
    private String name;

    public FindByNameItem(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Search item on name ------------");
        String name = input.ask("Please, provide name item which to find : ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item findByName : items) {
                System.out.println("------------ Found item " + findByName);
            }
        } else {
            System.out.println("------------ Item not found ------------");
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
