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
            .append("Меню." + ln)
            .append("0. Add new item" + ln)
            .append("1. Show all items" + ln)
            .append("2. Edit item" + ln)
            .append("3. Delete item" + ln)
            .append("4. Find item by id" + ln)
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
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"}); // создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init(); // создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        // напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        // создаем StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаем StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteItemThenTrackerNotToHaveItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(0));
    }

    @Test
    public void whenFindByIdItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Поиск заявки по ID ------------" + ln)
                .append("------------ Найденая заявка : " + item + "------------" + ln)
                .append(menu)
                .toString()
                )
        );
    }

    @Test
    public void whenFindByIdNameItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"5", "test name", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Поиск по имени заявки ------------" + ln)
                .append("------------ Найденая заявка : " + item + "------------" + ln)
                .append(menu)
                .toString()
                )
        );
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"1", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Список всех заявок ------------" + ln)
                .append(item + ln)
                .append("------------ Конец списка ------------" + ln)
                .append(menu)
                .append(menu)
                .toString()
                )
        );
    }
}
