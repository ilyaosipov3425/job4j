package ru.job4j.headfirstjava.gamefloodthesite;

/**
 * Программа "Потопи сайт"
 * @author Ilya Osipov (mailto:bullet3425@ynadex.ru)
 * @since 13.01.2019
 * @version 1.01
 */

public class SimpleDotComGame {

    public static void main(String[] args) {

        // создаем переменную, чтобы следить за количеством ходов пользователя.
        int numOfGuesses = 0;

        // это спциальный класс, который содержит метод
        // для приема пользовательского ввода.
        GameHelper helper = new GameHelper();

        // создаем оъект "сайта".
        SimpleDotCom theDotCom = new SimpleDotCom();

        // генерируем случайные числа для первой ячейки и используем для формирования массива.
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        // передаем сайту место положение его ячеек(массива).
        theDotCom.setLocationCells(locations);
        // создаем булеву переменную, чтобы проверить не закончилась ли игра.
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток");
            }
        }
    }
}
