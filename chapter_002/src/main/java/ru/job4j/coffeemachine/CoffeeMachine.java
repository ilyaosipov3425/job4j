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
        machine.changes(100, 35);
    }
    /**
     * @param value - купюра
     * @param price - цена кофе
     * @return - массив сдачи
     */
    int[] changes(int value, int price) {
        int[] result = new int[0];
        int remained = value - price;
        int position = 0;
        int i = 0;
        while (remained != 0) {
            i++;
            for (int c : coins) {
                if (c <= remained) {
                    position = c;
                    break;
                }
            }
            remained = remained - position;
            int[] rst = result;
            result = new int[i];
            System.arraycopy(rst, 0, result, 0, rst.length);
            result[i - 1] = position;
        }
        return result;
    }
}