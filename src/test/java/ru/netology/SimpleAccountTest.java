package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SimpleAccountTest {
    SimpleAccount simpleAccount = new SimpleAccount(10000);
    static long amountArray[];
        @BeforeAll
    static void setUp() {
        amountArray = new long[]{
                5000,
                500,
                3001
        };
    }

    @Test
    void pay() {
        for (long amount : amountArray) {
            Assertions.assertTrue(simpleAccount.pay(amount));
        }
    }

    @ParameterizedTest
    @ValueSource(longs = {
            1000,
            -500,
            3001
    })
    void validateTestAdd(long value) {
        Assertions.assertTrue(new SimpleAccount(0).add(value));
    }
}