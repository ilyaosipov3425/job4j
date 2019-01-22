package ru.job4j.pseudo;

/**
 * Класс Paint
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 22.01.2019
 * @version $Id$
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}
