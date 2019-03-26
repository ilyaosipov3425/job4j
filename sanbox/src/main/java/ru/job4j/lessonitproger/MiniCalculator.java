package ru.job4j.lesson_it_proger;

import java.util.Scanner;

/**
 * Песоочница для тренировок
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 31.10.2018
 */

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        result /= 2;
        System.out.println("Result is = " + result);
    }
}
