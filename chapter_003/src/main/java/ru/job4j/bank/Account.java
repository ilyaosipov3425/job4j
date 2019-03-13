package ru.job4j.bank;

/**
 * Класс Account - банковский счёт
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 11.03.2019
 * @version $Id$
 */

public class Account {
    /**
     * value - количество денег
     * requisites - реквизиты счёта
     */
    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public String getRequisites() {
        return requisites;
    }

    public boolean transfer(Account destination, double amount) {
        boolean successfully = false;
        if (amount > 0 && amount < this.value && destination != null) {
            successfully = true;
            this.value -= amount;
            destination.value += amount;
        }
        return successfully;
    }
}