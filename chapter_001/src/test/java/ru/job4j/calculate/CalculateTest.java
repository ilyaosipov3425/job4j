package ru.job4j.calculate

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*
* @author Osipov Ilya (mailto:bullet3425@yandex.ru)
* @version $Id$
* @since 13.06.2018
*/
public class CalculateTest {
/**
* Test echo
*/ @Test
public void whenTakeNameThenTreeEchoPlusName(){	
	String input = "Osipov Ilya";
	String expect = "Echo, echo, echo : Osipov Ilya";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
}

}