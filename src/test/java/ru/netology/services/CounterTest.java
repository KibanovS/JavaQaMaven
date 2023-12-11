package ru.netology.services;

import org.junit.jupiter.api.Assertions;

public class CounterTest {
    @org.testng.annotations.Test
    public void test() {
        Counter service = new Counter();
        int count = 0;
        int money = 0;
        int thrshold = 150_000;
        int expenses = 60_000;
        int income = 100_000;
        int expected = 2;

        for (int m = 1; m < 13; m++) {
            if (money < thrshold) {
                money = money + income - expenses;
            } else {
                count++;
                money = (money - expenses) / 3;
            }
        }
        int actual = service.calculate(income, expenses, thrshold);
        Assertions.assertEquals(expected, actual);
    }
}

