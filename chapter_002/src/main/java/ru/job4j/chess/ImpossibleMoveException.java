package ru.job4j.chess;

/**
 * Класс ImpossibleMoveException
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 20.02.2019
 * @version $Id$
 */

public class ImpossibleMoveException extends RuntimeException {

    public ImpossibleMoveException(String msg) {
        super(msg);
    }
}
