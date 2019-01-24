package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс FindByIdItem - поиск заявки по ID
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindByIdItem implements UserAction {
    private int key;
    private String name;

    public FindByIdItem(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Search item on Id ------------");
        String id = input.ask("Please, provide id item which to find : ");
        Item findById = tracker.findById(id);
        if (findById != null) {
            System.out.println("------------ Found item " + findById);
        } else {
            System.out.println("------------ Item not found ------------");
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
