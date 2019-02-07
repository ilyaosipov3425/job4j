package ru.job4j.coffeemachine;

/**
 * CoffeeMachine - организация выдачи сдачи
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 06.02.2019
 * @version $Id$
 */

public class CoffeeMachine {
    private int[] coins = {10, 5, 2, 1};

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.changes(50, 35);
    }
    /**
     * @param value - купюра
     * @param price - цена кофе
     * @return - массив сдачи
     */
    int[] changes(int value, int price) {
        int[] result = new int[10];
        int position = 0;
        int remained = value - price;
        for (int i = 0; i < result.length; i++) {
            if (remained != 0) {
                int first = coins[i];
                int number = remained / first;
                while (result.length != 0) {
                    int j = number;
                    while (j != 0) {
                        result[position++] = first;
                        j--;
                    }
                    break;
                }
                if (remained % first == 0) {
                    break;
                }
                remained = remained - (first * number);
            }
        }
        return result;
    }
}