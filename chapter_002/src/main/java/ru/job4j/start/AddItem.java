package ru.job4j.start;

import ru.job4j.models.*;

import java.util.function.Consumer;

/**
 * Класс AddItem - добавление новой заявки
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("------------ Adding new item ------------");
        String name = input.ask("Please, provide item name : ");
        String desc = input.ask("Please, provide item description : ");
        Item item = new Item(name, desc);
        tracker.add(item);
        output.accept("------------ New Item with Id : " + item.getId());
        output.accept("------------ New Item with Name : " + item.getName());
        output.accept("------------ New Item with Description : " + item.getDescription());
    }
}
