package ru.job4j.start;

/**
 * Класс TrackerSingleTwo - класс с использованием шаблона Singleton
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 31.01.2019
 * @version $Id$
 */

public class TrackerSingleTwo extends Tracker {
    private static TrackerSingleTwo instance;

    private TrackerSingleTwo() {
    }

    public static TrackerSingleTwo getInstance() {
        if (instance == null) {
            instance  = new TrackerSingleTwo();
        }
        return instance;
    }
}
