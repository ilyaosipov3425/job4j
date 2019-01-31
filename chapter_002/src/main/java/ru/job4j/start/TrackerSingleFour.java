package ru.job4j.start;

/**
 * Класс TrackerSingleFour - класс с использованием шаблона Singleton
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 31.01.2019
 * @version $Id$
 */

public class TrackerSingleFour extends Tracker {
    private TrackerSingleFour() {
    }

    public static TrackerSingleFour getInstance() {
        return Holder.INSTANCE;
    }

    public static final class Holder {
        private static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
    }
}
