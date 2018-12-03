package ru.job4j.models;

/**
 * Класс Item - Заявка
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Item {
    public String name;

    public String description;

    public long create;

    public String comments;

    private String id;

    public Item() {
    }

    public Item(String name, String description, long create, String comments) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.comments = comments;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getComments() {
        return this.comments;
    }

    public String getId() {
        return this.id;
    }

    public String setId(String id) {
        this.id = id;
    }
}
