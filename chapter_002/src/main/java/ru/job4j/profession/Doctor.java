package ru.job4j.profession;

public class Doctor extends Profession {
    public String healPatient;

    public Doctor(String healPatient) {
        this.healPatient = healPatient;
    }

    public String getHealPatient() {
        return this.healPatient;
    }
}
