package ru.job4j.headfirstjava.tobethecompiler;

/**
 * Программа "Магнитики с кодом"
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.01.2019
 * @version 1.01
 */

public class MultiFor {

    public static void main(String[] args) {
        MultiFor o = new MultiFor();
        o.go();
    }

    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }

            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
