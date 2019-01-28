package ru.job4j.start;

import java.util.List;

/**
 * Класс ValidateInput - переопределяет метод ask, что бы обрабатывались исключительные ситуации
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 25.01.2019
 * @version $Id$
 */

public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, List<Integer> range) {
        boolean invalide = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalide  = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalide);
        return value;
    }
}
