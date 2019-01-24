package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс FindAllItems - публикация всех заявок
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindAllItems implements UserAction {
    @Override
    public int key() {
        return 1;
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
        return "Show all items.";
    }
}
