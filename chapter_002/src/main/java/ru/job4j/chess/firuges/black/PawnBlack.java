package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PawnBlack implements Figure {
    private final Cell position;

    public PawnBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (this.impossibleMove(source, dest)) {
            throw new ImpossibleMoveException("Pawn moves only one square forward");
        }
        Cell[] steps = new Cell[] {dest };
        return steps;
    }

    private boolean impossibleMove(Cell source, Cell dest) {
        boolean rst = false;
        if (!(source.y == dest.y + 1 && source.x == dest.x)) {
            rst = true;
        }
        return rst;
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
