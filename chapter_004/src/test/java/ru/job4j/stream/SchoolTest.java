package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс SchoolTest
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.03.2019
 * @version $Id$
 */

public class SchoolTest {
    private School school = new School();
    private List<Student> list = Arrays.asList(
            new Student(70, "TestName1"),
            new Student(50, "TestName2"),
            new Student(10, "TestName3"),
            new Student(60, "TestName4"),
            new Student(30, "TestName5"),
            new Student(90, "TestName6")
    );

    @Test
    public void whenTheListOfStudentsOfClassA() {
        List<Student> result = school.collect(list, student -> student.getScore() >= 70);
        List<Student> expected = Arrays.asList(
                new Student(70, "TestName1"),
                new Student(90, "TestName6")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheListOfStudentsOfClassB() {
        List<Student> result = school.collect(list, student -> student.getScore() < 70 && student.getScore() >= 50);
        List<Student> expected = Arrays.asList(
                new Student(50, "TestName2"),
                new Student(60, "TestName4")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheListOfStudentsOfClassC() {
        List<Student> result = school.collect(list, student -> student.getScore() < 50);
        List<Student> expected = Arrays.asList(
                new Student(10, "TestName"),
                new Student(30, "TestName")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheMapOfStudents() {
        Map<String, Student> result = school.collectMap(list);
        Map<String, Student> expected = new HashMap<>();
        expected.put(list.get(0).getName(), list.get(0));
        expected.put(list.get(1).getName(), list.get(1));
        expected.put(list.get(2).getName(), list.get(2));
        expected.put(list.get(3).getName(), list.get(3));
        expected.put(list.get(4).getName(), list.get(4));
        expected.put(list.get(5).getName(), list.get(5));
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheStudentsLevelOf() {
        List<Student> result = school.levelOf(list, 70);
        List<Student> expected = Arrays.asList(
                new Student(90, "TestName6"),
                new Student(70, "TestName1")
        );
        assertThat(result, is(expected));
    }
}
