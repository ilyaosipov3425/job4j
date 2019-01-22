package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса Triangle
 * @autnor Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 22.01.2019
 * @version $Id$
 */

public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(new StringBuilder()
                        .append("   +   ")
                        .append("  +++  ")
                        .append(" +++++ ")
                        .append("+++++++").toString()
                )
        );
    }
}
