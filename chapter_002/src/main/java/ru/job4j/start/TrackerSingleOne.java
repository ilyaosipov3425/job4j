package ru.job4j.start;

/**
 * Класс TrackerSingleOne - класс с использованием шаблона Singleton
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 31.01.2019
 * @version $Id$
 */

public enum TrackerSingleOne {
    INSTANCE;

    Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
