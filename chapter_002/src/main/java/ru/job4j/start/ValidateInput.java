package ru.job4j.start;

/**
 * Класс ValidateInput - переопределяет метод ask, что бы обрабатывались исключительные ситуации
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 25.01.2019
 * @version $Id$
 */

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalide = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalide);
        return value;
    }
}
