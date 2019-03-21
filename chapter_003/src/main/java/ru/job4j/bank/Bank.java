package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс Bank - содержит логику использования банковского счёта
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 11.03.2019
 * @version $Id$
 */

public class Bank {

    private Map<User, List<Account>> userListMap = new HashMap<>();
    /**
     * Добавления пользователя
     */
    public void addUser(User user) {
        this.userListMap.putIfAbsent(user, new ArrayList<>());
    }
    /**
     * Удаление пользователя
     */
    public void deleteUser(User user) {
        this.userListMap.remove(user);
    }
    /**
     * Добавление счёта пользователю
     */
    public void addAccountToUser(String passport, Account account) {
        this.userListMap.get(this.userListMap.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst().orElse(null)).add(account);
    }
    /**
     * Удаление одного счёта пользователя
     */
    public void deleteAccountToUser(String passport, Account account) {
        this.userListMap.get(this.userListMap.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst().orElse(null)).remove(account);
    }
    /**
     * Получение списка счётов для пользователя
     */
    public List<Account> getUserAccounts(String passport) {
        return this.userListMap.entrySet().stream()
                .filter(userListEntry -> userListEntry.getKey().getPassport().equals(passport))
                .flatMap(userListEntry -> userListEntry.getValue().stream())
                .collect(Collectors.toList());
    }
    /**
     * Метод для перечесения денег с одного счёта на другой счёт.
     * @param srcPassport - паспорт исходящего пользователя
     * @param srcRequisite - реквезиты счёта исходящего пользователя
     * @param destPassport - паспорт получающего пользователя
     * @param destRequisite - реквезиты счёта получающего пользователя
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        User userSrc = getUser(srcPassport);
        User userDest = getUser(destPassport);
        Account accountSrc = null;
        Account accountDest = null;
        if (userSrc != null) {
            accountSrc = getAccount(userSrc, srcRequisite);
        }
        if (userDest != null) {
            accountDest = getAccount(userDest, destRequisite);
        }
        return accountSrc != null && accountDest != null && accountSrc.transfer(accountDest, amount);
    }
    /**
     * Поиск пользователя по паспорту
     * @param passport - паспорт пользователя
     */
    public User getUser(String passport) {
        return this.userListMap.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst().orElse(null);
    }
    /**
     * Поиск учетной записи пользователя и реквезитов счёта
     * @param user - пользователь
     * @param requisite - реквезиты счёта
     */
    public Account getAccount(User user, String requisite) {
        List<Account> list = this.userListMap.get(user);
        return list.stream()
                .filter(account -> account.getRequisites().equals(requisite))
                .findFirst().orElse(null);
    }
}