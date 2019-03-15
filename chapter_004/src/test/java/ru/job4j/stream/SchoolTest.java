package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс SchoolTest
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 14.03.2019
 * @version $Id$
 */

public class SchoolTest {
    @Test
    public void whenTheListOfStudentsOfClassA() {
        School school = new School();
        List<Student> list = new ArrayList<>();
        list.add(new Student(70));
        list.add(new Student(50));
        list.add(new Student(10));
        list.add(new Student(60));
        list.add(new Student(30));
        list.add(new Student(90));
        List<Student> result = school.collect(list, student -> student.getScore() >= 70);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70));
        expected.add(new Student(90));
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheListOfStudentsOfClassB() {
        School school = new School();
        List<Student> list = new ArrayList<>();
        list.add(new Student(70));
        list.add(new Student(50));
        list.add(new Student(10));
        list.add(new Student(60));
        list.add(new Student(30));
        list.add(new Student(90));
        List<Student> result = school.collect(list, student -> student.getScore() < 70 && student.getScore() >= 50);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50));
        expected.add(new Student(60));
        assertThat(result, is(expected));
    }

    @Test
    public void whenTheListOfStudentsOfClassC() {
        School school = new School();
        List<Student> list = new ArrayList<>();
        list.add(new Student(70));
        list.add(new Student(50));
        list.add(new Student(10));
        list.add(new Student(60));
        list.add(new Student(30));
        list.add(new Student(90));
        List<Student> result = school.collect(list, student -> student.getScore() < 50);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(30));
        expected.add(new Student(10));
        assertThat(result, is(expected));
    }
}
