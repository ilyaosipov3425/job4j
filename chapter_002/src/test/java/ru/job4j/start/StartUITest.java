package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.models.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест для класса StartUI
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 20.01.2019
 * @version $Id$
 */

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    public String ln = System.lineSeparator();
    public StringBuilder menu = new StringBuilder()
            .append("0. Add item" + ln)
            .append("1. Show all items" + ln)
            .append("2. Edit item" + ln)
            .append("3. Delete item" + ln)
            .append("4. Find by item ID" + ln)
            .append("5. Find items by name" + ln)
            .append("6. Exit program" + ln);

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker(); // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"}); // создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init(); // создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        // напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        // создаем StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "y"});
        // создаем StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteItemThenTrackerNotToHaveItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"3", item.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(0));
    }

    @Test
    public void whenFindByIdItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"4", item.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Search item on Id ------------" + ln)
                .append("------------ Found item " + item + ln)
                .toString()
                )
        );
    }

    @Test
    public void whenFindByIdNameItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"5", "test name", "y"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Search item on name ------------" + ln)
                .append("------------ Found item " + item + ln)
                .toString()
                )
        );
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Show all items ------------" + ln)
                .append(item + ln)
                .append("------------ End of list ------------" + ln)
                .toString()
                )
        );
    }
}
