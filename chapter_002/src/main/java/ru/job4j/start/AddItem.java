package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс AddItem - добавление новой заявки
 * @author Ilya OSipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class AddItem implements UserAction {
    private int key;
    private String name;

    public AddItem(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item ------------");
        String name = input.ask("Please, provide item name : ");
        String desc = input.ask("Please, provide item description : ");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("------------ New Item with Id : " + item.getId());
        System.out.println("------------ New Item with Name : " + item.getName());
        System.out.println("------------ New Item with Description : " + item.getDescription());
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}