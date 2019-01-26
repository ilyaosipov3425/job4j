package ru.job4j.start;

/**
 * Класс StubInput - эмуляция поведения пользователя.
 * @author Ilya OSipov (mailto:bullet3425@yandex.ru)
 * @since 20.01.2019
 * @version $Id$
 */

public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     * Например: Если пользователь
     * хочет выбрать добавление новой заявки ему нужно ввести:
     * 0 - выбор пункта меню "добавить новую заявку".
     * name - имя заявки.
     * desc - описание заявки.
     * y - выйти из трекера.
     */
    private final String[]  value;
    /**
     * Поле считатет количество вызовом метода ask.
     * При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * у нас есть объект в котором содержится заранее продуманные ответы.
     * При последовательном вызове метода ask нам надо возвращать соответствующие данные.
     * Как если бы мы симулировали поведение пользователя.
     * Для этого при каждом вызове метода ask мы увеличиваем счетчик и
     * при следующем вызове он вернет нам новое значение.
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        throw new UnsupportedOperationException("Unsupported operation");
        //return -1;
    }
}
