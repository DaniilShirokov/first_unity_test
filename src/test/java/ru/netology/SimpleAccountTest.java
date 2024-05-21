package ru.netology;

import org.junit.jupiter.api.Test;

class SimpleAccountTest {
   @Test
    void testAdd() {
        long amountArray[];
        amountArray = new long[] {
                5000,
                500,
                3001
        };
        for (long amount : amountArray) {
           // Assertions.assertTrue( SimpleAccount.add(amount));
        }
    }

//    @Test
//    void testAdd() {
//    }

//    @Test
//    void pay() {
//    }
//
//    @Test
//    void transfer() {
//    }

//    @ParameterizedTest
//    @ValueSource(longs = {
//            1000,
//            -500,
//            3001
//    });
//    void valida
}