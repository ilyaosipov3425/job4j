package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.models.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест для класса Tracker
 * @author Ilay Osipov (mailto:bullet3425@yanex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
}
