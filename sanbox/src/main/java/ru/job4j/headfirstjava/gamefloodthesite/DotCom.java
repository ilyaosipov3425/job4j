package ru.job4j.headfirstjava.gamefloodthesite;

import java.util.ArrayList;

/**
 * Программа "Потопи сайт"
 * @author Ilya Osipov (mailto:bullet3425@yndex.ru)
 * @since 13.01.2019
 * @verion 2.02
 */

public class SimpleDotCom {
    private ArrayList<String>locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {

        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
