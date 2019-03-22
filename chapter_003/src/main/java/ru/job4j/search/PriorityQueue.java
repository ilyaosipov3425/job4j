package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс PriorityQueue - очередь с приоритетом
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 08.02.2019
 * @version $Id$
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task - задача
     */
    public void put(Task task) {
        var i = 0;
        for (var index = 0; index < tasks.size(); index++) {
            if (tasks.get(index).getPriority() > task.getPriority()) {
                i = index;
                break;
            }
            i++;
        }
        tasks.add(i, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
