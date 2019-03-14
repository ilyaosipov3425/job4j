package ru.job4j.start;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Класс MenuTracker - реализовывает меню
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class MenuTracker {
    /**
     * Хранит ссылку на объект.
     */
    private Input input;
    /**
     * Хранит ссылку на объект.
     */
    private Tracker tracker;
    /**
     * Хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> action = new ArrayList<>();
    /**
     * Функциональный интерфейс Consumer
     */
    private final Consumer<String> output;
    /**
     * Конструктор.
     * @param output
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }
    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLength() {
        return this.action.size();
    }
    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.action.add(new AddItem(0, "Add item"));
        this.action.add(new FindAllItems(1, "Show all items"));
        this.action.add(new UpdateItem(2, "Edit item"));
        this.action.add(new DeleteItem(3, "Delete item"));
        this.action.add(new FindByIdItem(4, "Find by item ID"));
        this.action.add(new FindByNameItem(5, "Find items by name"));
        this.action.add(new ExitProgram(6, "Exit program"));
    }

    /**
     * Метод в зависимости от указаного ключа, выполняется соответствующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.action.get(key).execute(this.input, this.tracker, this.output);
    }
    /**
     * Метод вывода на экран.
     */
    public void show() {
        for (UserAction action : this.action) {
            if (action != null) {
                output.accept(action.info());
            }
        }
    }
}
