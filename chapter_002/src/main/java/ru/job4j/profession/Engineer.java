package ru.job4j.profession;

public class Engineer extends Profession {
    public String buildHouse;

    public Engineer(String buildHouse) {
        this.buildHouse = buildHouse;
    }

    public String getBuildHouse() {
        return this.buildHouse;
    }
}
