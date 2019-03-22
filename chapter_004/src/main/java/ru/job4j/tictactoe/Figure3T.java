package ru.job4j.tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * Класс Figure3T - отвечает за клетку на поле
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 22.03.2019
 * @version $Id$
 */

public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX, boolean markO) {
        this.markX = markX;
        this.markO = markO;
    }

    public void take(boolean markX) {
            this.markX = markX;
            this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}
