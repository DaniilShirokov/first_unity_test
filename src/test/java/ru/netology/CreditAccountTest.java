package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    static Account creditAccount;
    static Account simpleAccount;
    @BeforeAll
    static void setUp() {
        creditAccount = new CreditAccount(2000, -10000);
        simpleAccount = new SimpleAccount(3000);
    }
    @ParameterizedTest
    @ValueSource(longs = {
            -700,
            500,
            15000
    })
    void validateTestAdd(long value) {
        Assertions.assertTrue(creditAccount.transfer(simpleAccount,value));
    }
}