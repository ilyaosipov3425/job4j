package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
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

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объекте проинициальзирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription", 1234L);
        // Простовляем старый id из previous, которы был сгенерирован выше.
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новое имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test2", "test2", 123L));
        tracker.add(new Item("test3", "test3", 123L));
        Item[] ex = {
                tracker.add(new Item("test1", "testDescription", 123L)),
                tracker.add(new Item("test1", "test2", 123L)),
                tracker.add(new Item("test1", "test3", 123L)),
        };
        final Item[] result = tracker.findByName("test1");
        assertThat(result, is(ex));
    }
}
