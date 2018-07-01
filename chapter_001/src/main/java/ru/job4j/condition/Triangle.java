package ru.job4j.condition;

/**
 * Triangle (Вычисление площади треугольника)
 * @author Osipov Ilya (mailto:bullet3425@yandex.ru)
 * @version $Id$
 * @since 23.06.2018
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула
     *
     * (ab+ac+bc)/2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc)/2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует или -1, если теругольника нет.
     */
    public double area() {
        double rsl = -1; /*мы устанавливаем значение -1, т.к. может быть треугольника нет.
         Это значение говорит о том, что треугольнка нет.*/
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = (this.period(ab, ac, bc));
        if (this.exist(ab, ac,bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли посторить  треугольник.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab + ac < bc && ab + bc < ac && ac + bc < ab);
    }
}

