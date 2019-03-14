package ru.job4j.start;

import java.util.function.Consumer;

/**
 * Класс DeleteItem - удаление заявки
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Delete Item ------------");
        String id = input.ask("Please, provide id item which to delete : ");
        if (tracker.delete(id)) {
            output.accept("------------ Item Delete ------------");
        } else {
            output.accept("------------ Item not found ------------");
        }
    }
}
