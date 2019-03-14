package ru.job4j.start;

import ru.job4j.models.*;

import java.util.List;
import java.util.function.Consumer;

/**
 * Класс FindByNameItem - поиск заявки по имени
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindByNameItem extends BaseAction {

    public FindByNameItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Search item on name ------------");
        String name = input.ask("Please, provide name item which to find : ");
        List<Item> items = tracker.findByName(name);
        if (items.size() != 0) {
            for (Item findByName : items) {
                output.accept("------------ Found item " + findByName);
            }
        } else {
            output.accept("------------ Item not found ------------");
        }
    }
}
