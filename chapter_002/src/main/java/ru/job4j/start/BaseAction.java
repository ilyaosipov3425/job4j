package ru.job4j.start;

/**
 * Класс BaseAction - абстрактный класс, который частично реализует методы интерфейса UserAction для реализации действий
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 29.01.2019
 * @version $Id$
 */

public abstract class BaseAction implements UserAction {
    private final int key;
    private final String name;

    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
