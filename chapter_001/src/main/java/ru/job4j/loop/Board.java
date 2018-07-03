package ru.job4j.loop;

/**
 * Шахматная доска в псевдографике.
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 02.07.2018
 */
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int w = 0; w < height; w++) {
            for(int h = 0; h < width; h++ ) {
                if(screen.length() % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}