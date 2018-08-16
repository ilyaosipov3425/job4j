package ru.job4j.profession;

public class Teacher extends Profession {
    public String learnStudent;

    public Teacher(String learnStudent) {
        this.learnStudent = learnStudent;
    }

    public String getLernStudent() {
        return this.learnStudent;
    }
}
