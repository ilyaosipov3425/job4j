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
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Генерация случайных чисел.
     */
    private static final Random RN = new Random();

    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификции нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод редактирования заявок.
     * @param id
     * @param item
     */
    public void replace(String id, Item item) {
    }

    /**
     * Метод удаления заявки.
     */
    public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(id)) {
                System.arraycopy(items, i + 1, items, i, position - 1);
            }
        }
    }

    /**
     * Метод отображения списка всех заявок.
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод получения списка заявок по имени.
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        return null;
    }

    /**
     * Метод получния заявки по id.
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item: items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
