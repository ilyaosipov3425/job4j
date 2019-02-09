package ru.job4j.search;

/**
 * Класс Tack - каркас очереди с приоритетом
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 08.02.2019
 * @version $Id$
 */

public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getPriority() {
        return this.priority;
    }
}
