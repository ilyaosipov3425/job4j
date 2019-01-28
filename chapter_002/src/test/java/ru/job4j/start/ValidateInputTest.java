package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Класс ValidateInputTest - тестирует класс ValidateInput
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 28.01.2019
 * @version $Id$
 */

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        List<Integer> range = new ArrayList<>();
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalide", "1"})
        );
        input.ask("Enter", range);
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please enter validate data again.%n")
                )
        );
    }
}
