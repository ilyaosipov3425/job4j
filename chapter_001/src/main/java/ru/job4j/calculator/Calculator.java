package ru.job4j.calculator;
/**
 * Calculator
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 */
public class Calculator{
    private double result;

    public void add(double first, double second){
        this.result = first + second;
    }

    public void subtract(double first, double second){
        this.result = first - second;
    }

    public void div(double first, double second){
        this.result = first / second;
    }

    public void multiple(double first, double second){
        this.result = first * second;
    }

    public double getResult(){
        return this.result;
    }
}

