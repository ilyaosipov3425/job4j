package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * Логика игры крестики-нолики.
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 08.08.2018
 */

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX = startX + deltaX;
            startY = startY + deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isWinnerX() {
        boolean result = false;
        if (this.table[0][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[2][2].hasMarkX() ||
                (this.table[2][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[0][2].hasMarkX())) {
            result = true;
            for (int i = 0; i < 2; i++) {
                if (this.table[0][i].hasMarkX() && this.table[1][i].hasMarkX() && this.table[2][i].hasMarkX() ||
                        (this.table[i][0].hasMarkX() && this.table[i][1].hasMarkX() && this.table[i][2].hasMarkX())) {
                    result = true;
                }
            }
        }
        return result;
    }


    public boolean isWinnerO() {
        boolean result = false;
        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[0][0] != null) {
                result = true;
            }
        }
        return result;
    }
}
