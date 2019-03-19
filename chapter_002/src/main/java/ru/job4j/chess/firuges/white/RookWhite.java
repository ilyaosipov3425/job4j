package ru.job4j.chess.firuges.white;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * Класс RookWhite - шахматная фигура Ладья
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.03.2019
 */
public class RookWhite implements Figure {
    private final Cell position;

    public RookWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (impossibleMove(source, dest)) {
            throw new ImpossibleMoveException("The Rook moves only vertically or horizontally!");
        }
        int size = 0;
        int deltaX = 0;
        int deltaY = 0;
        if (dest.x == source.x) {
            deltaY = (dest.y - source.y) > 0 ? 1 : -1;
            size = Math.abs(dest.y - source.y);
        } else if (dest.y == source.y) {
            deltaX = (dest.x - source.x) > 0 ? 1 : -1;
            size = Math.abs(dest.x - source.x);
        }
        Cell[] steps = new Cell[size];
        int stepX = source.x + deltaX;
        int stepY = source.y + deltaY;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.getStep(stepX, stepY);
            stepX += deltaX;
            stepY += deltaY;
        }
        return steps;
    }

    private boolean impossibleMove(Cell source, Cell dest) {
        boolean result = false;
        if (!(source.y == dest.y || source.x == dest.x)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}
