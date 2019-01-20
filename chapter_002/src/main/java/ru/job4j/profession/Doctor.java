package ru.job4j.profession;

/**
 * Класс Доктор
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 20.11.2018
 */

public class Doctor extends Profession {
    public String healPatient;

    public Doctor(String healPatient) {
        this.healPatient = healPatient;
    }

    public String getHealPatient() {
        return this.healPatient;
    }
}
