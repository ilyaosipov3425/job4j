package ru.job4j.start;

import java.util.List;

/**
 * Input - интерфейс.
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 19.01.2019
 * @version $Id$
 */

public interface Input {
    String ask(String question);

    int ask(String question, List<Integer> range);
}
