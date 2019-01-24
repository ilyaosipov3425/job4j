package ru.job4j.start;

/**
 * Класс DeleteItem - удаление заявки
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class DeleteItem implements UserAction {
    private int key;
    private String name;

    public DeleteItem(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Delete Item ------------");
        String id = input.ask("Please, provide id item which to delete : ");
        if (tracker.delete(id)) {
            System.out.println("------------ Item Delete ------------");
        } else {
            System.out.println("------------ Item not found ------------");
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
