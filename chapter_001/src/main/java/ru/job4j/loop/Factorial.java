package ru.job4j.loop;

/**
 * Программа вычисляющая факториал
 * @author Osipov Ilya
 * @version $Id$
 * @since 30.06.2018
 */
public class Factorial {
    public int calc(int n) {
        int sum = 0;
        boolean b = true;
        for(int i = 1; i <= n; i++) {
            if (i == n)
                sum *= i;
            }
            return sum;
        }
    }