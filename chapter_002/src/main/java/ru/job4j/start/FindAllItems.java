package ru.job4j.start;

import ru.job4j.models.*;

import java.util.List;

/**
 * Класс FindAllItems - публикация всех заявок
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindAllItems extends BaseAction {

    public FindAllItems(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items ------------");
        List<Item> findAllItem = tracker.findAll();
        for (Item item : findAllItem) {
            System.out.println(item);
        }
        System.out.println("------------ End of list ------------");
    }
}
