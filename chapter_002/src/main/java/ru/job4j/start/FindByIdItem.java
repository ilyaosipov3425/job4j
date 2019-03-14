package ru.job4j.start;

import ru.job4j.models.*;

import java.util.function.Consumer;

/**
 * Класс FindByIdItem - поиск заявки по ID
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class FindByIdItem extends BaseAction {

    public FindByIdItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Search item on Id ------------");
        String id = input.ask("Please, provide id item which to find : ");
        Item findById = tracker.findById(id);
        if (findById != null) {
            output.accept("------------ Found item " + findById);
        } else {
            output.accept("------------ Item not found ------------");
        }
    }
}
