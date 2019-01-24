package ru.job4j.start;

/**
 * Класс ExitProgram - выход из программы
 * @author Iya Osipov (mailto:bullet3425@yandex.ru)
 * @since 23.01.2019
 * @version $Id$
 */

public class ExitProgram implements UserAction {
    private int key;
    private String name;

    public ExitProgram(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Exit Program ------------");
        System.exit(0);
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
