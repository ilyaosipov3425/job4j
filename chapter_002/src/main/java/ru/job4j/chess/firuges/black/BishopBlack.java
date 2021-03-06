package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * Класс BishopBlack - шахматная фигура Слон
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.03.2019
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (isDiagonal(source, dest)) {
            throw new ImpossibleMoveException("The Bishop moves diagonally!");
        }
        int size = Math.abs(source.y - dest.y);
        Cell[] steps = new Cell[size];
        int deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        int deltaY = (dest.y - source.y) < 0 ? -1 : 1;
        int stepX = source.x + deltaX;
        int stepY = source.y + deltaY;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.getStep(stepX, stepY);
            stepX += deltaX;
            stepY += deltaY;
        }
        return steps;
    }

    private boolean isDiagonal(Cell source, Cell dest) {
        boolean result = false;
        if (Math.abs(source.x - dest.x) != Math.abs(source.y - dest.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
