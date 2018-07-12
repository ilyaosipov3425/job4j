package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        if (this.data.length == value.length) {
            result = true;
        }
        for (int i = 0; i < value.length; i++) {
            if (this.data.length != value[i]) {
                result = false;
            }
        }
        return result;
    }
}