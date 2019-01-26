package ru.job4j.start;

/**
 * Класс MenuOutException - принимает сообщение об ошибке в конструктора и передает его в конструктор родителя
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 25.01.2019
 * @version $Id$
 */

public class MenuOutException extends RuntimeException {

    public MenuOutException(String msg) {
        super(msg);
    }
}
