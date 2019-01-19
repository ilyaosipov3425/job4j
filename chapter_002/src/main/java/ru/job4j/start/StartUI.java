package ru.job4j.start;

import ru.job4j.models.*;

/**
 * Класс StartUI - точка входа в программу
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.01.2019
 * @version $Id$
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для просмотра всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа для поиска заявки по ID.
     */
    private static final String FINDID = "4";

    /**
     * Константа для поиска завки по NAME.
     */
    private static final String FINDNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструктор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основной цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.findAllItem();
            } else if (EDIT.equals(answer)) {
                this.replaceItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findIdItem();
            } else if (FINDNAME.equals(answer)) {
                this.findNameItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки ------------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "------------");
    }

    /**
     * Метод реализует просмотр всех заявок.
     */
    private void findAllItem() {
        System.out.println("------------ Список всех заявок ------------");
        Item[] findAll = tracker.findAll();
        for (Item item : findAll) {
            System.out.println(item);
        }
        System.out.println("------------ Конец списка ------------");
    }

    /**
     * Метод реализует редактирование заявки.
     */
    private void replaceItem() {
        System.out.println("------------ Реадктирование заявки ------------");
        String id = this.input.ask("Введите id заявки, которую нужно отредактировать : ");
        String name = this.input.ask("Введите новое имя заявки : ");
        String description = this.input.ask("Введите новое описание заявки : ");
        Item replace = tracker.findById(id);
        if (tracker.replace(id, new Item(name, description))) {
            System.out.println("------------ Заявка отредактирована ------------");
        } else {
            System.out.println("------------ Заявка не найдена ------------");
        }
    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки ------------");
        String id = this.input.ask("Введите id заявки, которую нужно удалить : ");
        if (tracker.delete(id)) {
            System.out.println("------------ Заявка удалена ------------");
        } else {
            System.out.println("------------ Заявка не найдена ------------");
        }
    }

    /**
     * Метод реализует поиск заявки по ID.
     */
    private void findIdItem() {
        System.out.println("------------ Поиск заявки по ID ------------");
        String id = this.input.ask("Введите id заявки, которую требуется найти : ");
        Item findById = tracker.findById(id);
        if (findById != null) {
            System.out.println("------------ Найденая заявка : " + findById + "------------");
        } else {
            System.out.println("------------ Заявка не найдена ------------");
        }
    }

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findNameItem() {
        System.out.println("------------ Поиск по имени заявки ------------");
        String name = this.input.ask("Введите имя заявки, которую требуется найти : ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item findByName : items) {
                System.out.println("------------ Найденая заявка : " + findByName + "------------");
            }
        } else {
            System.out.println("------------ Заявка не найдена ------------");
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
