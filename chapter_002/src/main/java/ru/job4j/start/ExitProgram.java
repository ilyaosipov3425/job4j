package ru.job4j.start;

/**
 * Класс ExitProgram - выход из программы
 * @author Iya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class ExitProgram extends BaseAction {

    public ExitProgram(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Exit Program ------------");
        System.exit(0);
    }
}
