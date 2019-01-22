package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса Square
 * @author Ilya Oipov (mailto:bullet3425@yandex.ru)
 * @since 22.01.2019
 * @version $Id$
 */

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(new StringBuilder()
                        .append("++++")
                        .append("+     +")
                        .append("+     +")
                        .append("++++").toString()
                )
        );
    }
}
