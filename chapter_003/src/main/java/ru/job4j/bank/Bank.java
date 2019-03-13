package ru.job4j.bank;

import java.util.*;

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
        this.userListMap.put(user, new ArrayList<>());
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
        if (account != null || passport != null) {
            for (User user : this.userListMap.keySet()) {
                if (user.getPassport().equals(passport)) {
                    this.userListMap.get(user).add(account);
                }
            }
        }
    }
    /**
     * Удаление одного счёта пользователя
     */
    public void deleteAccountToUser(String passport, Account account) {
        if (account != null || passport != null) {
            for (User user : this.userListMap.keySet()) {
                if (user.getPassport().equals(passport)) {
                    this.userListMap.get(user).remove(account);
                    break;
                }
            }
        }
    }
    /**
     * Получение списока счётов для пользователя
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> accounts = new ArrayList<>();
        if (passport == null) {
            return new ArrayList<>();
        }
        //List<Account> accounts = new ArrayList<>();
        for (User user : this.userListMap.keySet()) {
            if (user.getPassport().equals(passport)) {
                accounts = this.userListMap.get(user);
                break;
            }
        }
        return accounts;
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
        User rst = null;
        for (User user : this.userListMap.keySet()) {
            if (user.getPassport().equals(passport)) {
                rst = user;
            }
        }
        return rst;
    }
    /**
     * Поиск учетной записи пользователя и реквезитов счёта
     * @param user - пользователь
     * @param requisite - реквезиты счёта
     */
    public Account getAccount(User user, String requisite) {
        Account rst = null;
        for (Account account : this.userListMap.get(user)) {
            if (account.getRequisites().equals(requisite)) {
                rst = account;
            }
        }
        return rst;
    }
}