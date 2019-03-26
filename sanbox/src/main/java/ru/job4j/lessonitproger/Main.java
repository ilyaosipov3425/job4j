package ru.job4j.lesson_it_proger;

import java.util.Scanner;

/**
 * Песоочница для тренировок
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 31.10.2018
 */

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        if (first >= 10) {
            System.out.print("Num is 10");
        }
    }
}