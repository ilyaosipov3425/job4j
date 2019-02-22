package ru.job4j.chess;

/**
 * Класс OccupiedWayException
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 20.02.2019
 * @version $Id$
 */

public class OccupiedWayException extends RuntimeException {

    public OccupiedWayException(String msg) {
        super(msg);
    }
}
