package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Item> result = new ArrayList<>();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        result.add(item);
        assertThat(tracker.findAll(), is(result));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = tracker.add(new Item("test1", "testDescription", 123L));
        // Создаем новую заявку.
        Item next = tracker.add(new Item("test2", "testDescription", 1234L));
        // Простовляем старый id из previous, которы был сгенерирован выше.
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новое имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFindByNameThenArrayItemsReturn() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test2", "test2", 123L));
        tracker.add(new Item("test3", "test3", 123L));
        List<Item> ex = Arrays.asList(
                tracker.add(new Item("test1", "testDescription", 123L)),
                tracker.add(new Item("test1", "test2", 123L)),
                tracker.add(new Item("test1", "test3", 123L))
        );
        final List<Item> result = tracker.findByName("test1");
        assertThat(result, is(ex));
    }

    @Test
    public void whenDeleteItemThenReturnArrayItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item1 = new Item("test2", "testDescription", 123L);
        Item item2 = new Item("test3", "testDescription", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.delete(item.getId()), is(true));
    }

    @Test
    public void whenDeleteAnotherItemThenReturnArrayItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item1 = new Item("test2", "testDescription", 123L);
        Item item2 = new Item("test3", "test Description", 123L);
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.delete(item1.getId()), is(true));
    }
}
