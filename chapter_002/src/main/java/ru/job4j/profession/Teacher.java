package ru.job4j.profession;

/**
 * Класс Учитель
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Teacher extends Profession {
    public String learnStudent;

    public Teacher(String learnStudent) {
        this.learnStudent = learnStudent;
    }

    public String getLearnStudent() {
        return this.learnStudent;
    }
}
