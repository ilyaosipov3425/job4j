package ru.job4j.bank;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNull;
import static org.hamcrest.core.Is.is;

/**
 * Класс BankTest - проверка работы методов класса Bank
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 13.03.2019
 * @version $Id$
 */

public class BankTest {

    @Test
    public void whenAddUser() {
        Bank bank = new Bank();
        User user = new User("Ivan", "1234567");
        bank.addUser(user);
        User result = bank.getUser("1234567");
        assertThat(result.getName(), is("Ivan"));
    }

    @Test
    public void whenDeleteUser() {
        Bank bank = new Bank();
        User user = new User("Ivan", "1234567");
        bank.addUser(user);
        bank.deleteUser(user);
        assertNull(bank.getUser("1234567"));
    }

    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        User user = new User("Ivan", "1234567");
        Account account = new Account(7654321D, "RequisitesTest");
        bank.addUser(user);
        bank.addAccountToUser("1234567", account);
        List<Account> result = bank.getUserAccounts("1234567");
        assertThat(result.get(0).getRequisites(), is("RequisitesTest"));
    }

    @Test
    public void whenDeleteAccountToUser() {
        Bank bank = new Bank();
        User user = new User("Ivan", "1234567");
        Account account = new Account(7654321D, "RequisitesTest");
        bank.addUser(user);
        bank.addAccountToUser("1234567", account);
        bank.deleteAccountToUser("1234567", account);
        List<Account> result = bank.getUserAccounts("1234567");
        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void whenTransferMoneyOneUserToAnotherUser() {
        Bank bank = new Bank();
        User srcUser = new User("Ivan", "1234567");
        User destUser = new User("Ilya", "2345678");
        Account srcAccount = new Account(7654321D, "srcRequisitesTest");
        Account destAccount = new Account(8765432D, "destRequisitesTest");
        bank.addUser(srcUser);
        bank.addUser(destUser);
        bank.addAccountToUser("1234567", srcAccount);
        bank.addAccountToUser("2345678", destAccount);
        bank.transferMoney("1234567", "srcRequisitesTest", "2345678", "destRequisitesTest", 10000D);
        List<Account> resultSrc = bank.getUserAccounts("1234567");
        List<Account> resultDest = bank.getUserAccounts("2345678");
        assertThat(resultSrc.get(0).getValue(), is(7644321D));
        assertThat(resultDest.get(0).getValue(), is(8775432D));
    }
}