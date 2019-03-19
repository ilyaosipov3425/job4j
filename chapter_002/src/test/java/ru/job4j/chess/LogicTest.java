package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.firuges.white.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс LogicTest
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 19.03.2019
 * @version $Id$
 */

public class LogicTest {
    private Logic logic = new Logic();
    private StringBuilder rst = new StringBuilder();

    @Test
    public void whenFigureNotFound() {
        logic.add(new BishopBlack(Cell.A8));
        try {
            logic.move(Cell.A7, Cell.A6);
        } catch (FigureNotFoundException fnf) {
            rst.append(fnf);
        }
        assertThat(rst.toString(), is(String.format("%s", new FigureNotFoundException("Figure not found!"))));
    }

    @Test
    public void whenOccupiedWayException() {
        logic.add(new PawnBlack(Cell.D7));
        logic.add(new BishopBlack(Cell.C8));
        try {
            logic.move(Cell.C8, Cell.E6);
        } catch (OccupiedWayException ow) {
            rst.append(ow);
        }
        assertThat(rst.toString(), is(String.format("%s", new OccupiedWayException("Occupied way!"))));
    }

    @Test
    public void whenImpossibleMoveException() {
        PawnBlack pawn = new PawnBlack(Cell.A7);
        try {
            Cell[] pawnWay = pawn.way(Cell.A7, Cell.A5);
            for (Cell cell : pawnWay) {
                rst.append(cell);
                rst.append(" ");
            }
        } catch (ImpossibleMoveException im) {
            rst.append(im);
        }
        assertThat(rst.toString(), is(String.format("%s", new ImpossibleMoveException("Pawn moves only one cell forward!"))));
    }

    @Test
    public void whenWalkBishopBlack() {
        logic.add(new BishopBlack(Cell.C8));
        boolean rst = logic.move(Cell.C8, Cell.A6);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkKingBlack() {
        logic.add(new KingBlack(Cell.D8));
        boolean rst = logic.move(Cell.D8, Cell.D7);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkKnightBlack() {
        logic.add(new KnightBlack(Cell.B8));
        boolean rst = logic.move(Cell.B8, Cell.C6);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkPawnBlack() {
        logic.add(new PawnBlack(Cell.B7));
        boolean rst = logic.move(Cell.B7, Cell.B6);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkVerticalQueenBlack() {
        logic.add(new QeenBlack(Cell.E8));
        boolean rst = logic.move(Cell.E8, Cell.E3);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkHorizontalQueenBlack() {
        logic.add(new QeenBlack(Cell.E3));
        boolean rst = logic.move(Cell.E3, Cell.A3);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkDiagonalQueenBlack() {
        logic.add(new QeenBlack(Cell.A3));
        boolean rst = logic.move(Cell.A3, Cell.D6);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkRookBlack() {
        logic.add(new RookBlack(Cell.A8));
        boolean rst = logic.move(Cell.A8, Cell.A5);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkBishopWhite() {
        logic.add(new BishopWhite(Cell.C1));
        boolean rst = logic.move(Cell.C1, Cell.A3);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkKingWhite() {
        logic.add(new KingWhite(Cell.D1));
        boolean rst = logic.move(Cell.D1, Cell.D2);
        assertThat(rst, is(true));
    }

    @Test
    public void whenKnightWhite() {
        logic.add(new KnightWhite(Cell.B1));
        boolean rst = logic.move(Cell.B1, Cell.C3);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkPawnWhite() {
        logic.add(new PawnWhite(Cell.B2));
        boolean rst = logic.move(Cell.B2, Cell.B3);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkVerticalQueenWhite() {
        logic.add(new QeenWhite(Cell.E1));
        boolean rst = logic.move(Cell.E1, Cell.E5);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkHorizontalQueenWhite() {
        logic.add(new QeenWhite(Cell.E5));
        boolean rst = logic.move(Cell.E5, Cell.A5);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkDiagonalQueenWhite() {
        logic.add(new QeenWhite(Cell.A5));
        boolean rst = logic.move(Cell.A5, Cell.C7);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWalkRookWhite() {
        logic.add(new QeenWhite(Cell.A1));
        boolean rst = logic.move(Cell.A1, Cell.A5);
        assertThat(rst, is(true));
    }
}
