package ru.job4j.start;

import java.util.*;

/**
 * Класс ConsoleInput - ввод пользовательских данных из консоли
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 18.01.2019
 * @version $Id$
 */

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}
