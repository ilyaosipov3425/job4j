package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * Класс KnightBlack - шахматная фигура Конь
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 19.03.2019
 */
public class KnightBlack implements Figure {
    private final Cell position;

    public KnightBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (impossibleMove(source, dest)) {
            throw new ImpossibleMoveException("The Knight only walks by the letter 'Г'!");
        }
        return new Cell[] {dest };
    }

    private boolean impossibleMove(Cell source, Cell dest) {
        boolean result = false;
        if (!(Math.abs(dest.x - source.x) == 2 && Math.abs(dest.y - source.y) == 1)
                && !(Math.abs(dest.x - source.x) == 1) && (Math.abs(dest.y - source.y) == 2)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}
