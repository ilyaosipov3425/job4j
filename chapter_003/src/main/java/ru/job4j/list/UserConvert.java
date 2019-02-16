package ru.job4j.list;

import java.util.HashMap;
import java.util.List;

/**
 * Класс UserConvert - преобразование List в Map
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.02.2019
 * @version $Id$
 */

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
}
