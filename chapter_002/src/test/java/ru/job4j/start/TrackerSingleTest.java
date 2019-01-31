package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс TrackerSingleTest - класс проверяет работу шаблона Singleton
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 31.01.2019
 * @version $Id$
 */

public class TrackerSingleTest {

    @Test
    public void whenTrackerSingleOne() {
        Tracker tracker = TrackerSingleOne.INSTANCE.getTracker();
        Tracker tracker1 = TrackerSingleOne.INSTANCE.getTracker();
        tracker.add(new Item("test", "testDesc"));
        Item[] items = tracker1.findByName("test");
        assertThat("test", is(items[0].getName()));
    }

    @Test
    public void whenTrackerSingleTwo() {
        Tracker tracker = TrackerSingleTwo.getInstance();
        Tracker tracker1 = TrackerSingleTwo.getInstance();
        tracker.add(new Item("test", "testDesc"));
        Item[] items = tracker1.findByName("test");
        assertThat("test", is(items[0].getName()));
    }

    @Test
    public void whenTrackerSingleThree() {
        Tracker tracker = TrackerSingleThree.getInstance();
        Tracker tracker1 = TrackerSingleThree.getInstance();
        tracker.add(new Item("test", "testDesc"));
        Item[] items = tracker1.findByName("test");
        assertThat("test", is(items[0].getName()));
    }

    @Test
    public void whenTrackerSingleFour() {
        Tracker tracker = TrackerSingleFour.getInstance();
        Tracker tracker1 = TrackerSingleFour.getInstance();
        tracker.add(new Item("test", "testDesc"));
        Item[] items = tracker1.findByName("test");
        assertThat("test", is(items[0].getName()));
    }
}
