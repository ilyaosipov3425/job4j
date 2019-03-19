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
    private Bank bank = new Bank();

    @Test
    public void whenAddUser() {
        bank.addUser(new User("Ivan", "1234567"));
        User result = bank.getUser("1234567");
        assertThat(result.getName(), is("Ivan"));
    }

    @Test
    public void whenDeleteUser() {
        bank.addUser(new User("Ivan", "1234567"));
        bank.deleteUser(new User("Ivan", "1234567"));
        assertNull(bank.getUser("1234567"));
    }

    @Test
    public void whenAddAccountToUser() {
        bank.addUser(new User("Ivan", "1234567"));
        bank.addAccountToUser("1234567", new Account(7654321D, "RequisitesTest"));
        List<Account> result = bank.getUserAccounts("1234567");
        assertThat(result.get(0).getRequisites(), is("RequisitesTest"));
    }

    @Test
    public void whenDeleteAccountToUser() {
        Account account = new Account(7654321D, "RequisitesTest");
        bank.addUser(new User("Ivan", "1234567"));
        bank.addAccountToUser("1234567", account);
        bank.deleteAccountToUser("1234567", account);
        List<Account> result = bank.getUserAccounts("1234567");
        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void whenTransferMoneyOneUserToAnotherUser() {
        bank.addUser(new User("Ivan", "1234567"));
        bank.addUser(new User("Ilya", "2345678"));
        bank.addAccountToUser("1234567", new Account(7654321D, "srcRequisitesTest"));
        bank.addAccountToUser("2345678", new Account(8765432D, "destRequisitesTest"));
        bank.transferMoney("1234567", "srcRequisitesTest", "2345678", "destRequisitesTest", 10000D);
        List<Account> resultSrc = bank.getUserAccounts("1234567");
        List<Account> resultDest = bank.getUserAccounts("2345678");
        assertThat(resultSrc.get(0).getValue(), is(7644321D));
        assertThat(resultDest.get(0).getValue(), is(8775432D));
    }
}