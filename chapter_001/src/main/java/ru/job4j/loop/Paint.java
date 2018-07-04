package ru.job4j.loop;

/**
 * Программа строит пирамиду в псевдографике
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 04.07.2018
 */
public class Paint {
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // Ширина будет равно высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for(int row = 0; row != height; row++) {
            // внитрений цикл определяет положение ячейки в строке.
            for(int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае определяем, сколько галок будет на строке
                if(row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for(int row = 0; row != height; row++) {
            for(int column = 0; column != weight; column++) {
                if(row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String piramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for(int row = 0; row != height; row++) {
            for(int column = 0; column != weight; column++) {
                if(row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}