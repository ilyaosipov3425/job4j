package ru.job4j.start;

import java.util.function.Consumer;

/**
 * Класс UserAction - интерфейс
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    int key();

    /**
     * Основной метод.
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input, Tracker tracker, Consumer<String> output);

    /**
     * Метод возвращаяет информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
