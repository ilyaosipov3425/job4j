package ru.job4j.chess;

/**
 * Класс FigureNotFoundException
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 20.02.2019
 * @version $Id$
 */

public class FigureNotFoundException extends RuntimeException {

    public FigureNotFoundException(String msg) {
        super(msg);
    }
}
