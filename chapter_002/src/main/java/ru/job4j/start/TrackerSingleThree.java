package ru.job4j.start;

/**
 * Класс TrackerSingleThree - класс с использованием шаблона Singleton
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 31.01.2019
 * @version $Id$
 */

public class TrackerSingleThree extends Tracker {
    private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();

    private TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }
}
