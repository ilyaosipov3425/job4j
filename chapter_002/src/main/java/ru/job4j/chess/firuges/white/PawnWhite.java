package ru.job4j.chess.firuges.white;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * Класс PawnWhite - шахматная фигура Пешка
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.03.2019
 */
public class PawnWhite implements Figure {
    private final Cell position;

    public PawnWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (impossibleMove(source, dest)) {
            throw new ImpossibleMoveException("Pawn moves only one cell forward!");
        }
        Cell[] steps = new Cell[] {dest };
        return steps;
    }

    private boolean impossibleMove(Cell source, Cell dest) {
        boolean result = false;
        if (!(source.y == dest.y - 1 && source.x == dest.x)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnWhite(dest);
    }
}
