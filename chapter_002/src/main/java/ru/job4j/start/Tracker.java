package ru.job4j.start;

import ru.job4j.models.*;
import java.util.*;

/**
 * Класс Tracker - Хранилище для всех заявок
 * @author Ilya Osipov (mailto:bullet3425@ayndex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Генерация случайных чисел.
     */
    private static final Random RN = new Random();

    /**
     * Метод реализующий добавление заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификции нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод редактирования заявок.
     *
     * @param id
     * @param item
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (findById(id).equals(items.get(i))) {
                items.set(i, item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаления заявки.
     *
     * @param id
     */
    public boolean delete(String id) {
        boolean result = false;
        for (Item value : items) {
            if (value.getId().equals(id)) {
                items.remove(value);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод отображения списка всех заявок.
     *
     * @return
     */
    public List<Item> findAll() {
        return new ArrayList<>(items);
    }

    /**
     * Метод получения списка заявок по имени.
     *
     * @param key
     * @return
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item value : items) {
            if (value.getName().equals(key)) {
                result.add(value);
            }
        }
        return result;
    }

    /**
     * Метод получения заявки по id.
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item result = null;
        for (Item value : items) {
            if (value.getId().equals(id)) {
                result = value;
            }
        }
        return result;
    }
}