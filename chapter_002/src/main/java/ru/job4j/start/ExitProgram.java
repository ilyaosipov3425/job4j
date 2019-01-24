package ru.job4j.start;

/**
 * Класс ExitProgram - выход из программы
 * @author Iya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class ExitProgram implements UserAction {
    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Exit Program ------------");
        System.exit(0);
    }

    @Override
    public String info() {
        return "Exit Program";
    }
}
