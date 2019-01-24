package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс UpdateItem - редактирование заявки
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class UpdateItem implements UserAction {
    private int key;
    private String name;

    public UpdateItem(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Edit the Item ------------");
        String id = input.ask("Please, provide id item which to edit : ");
        String name = input.ask("Please, provide item new name : ");
        String desc = input.ask("Please, provide item new description : ");
        Item replace = tracker.findById(id);
        if (tracker.replace(id, new Item(name, desc))) {
            System.out.println("------------ Item is edited ------------");
        } else {
            System.out.println("------------ Item not found ------------");
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
