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
}
