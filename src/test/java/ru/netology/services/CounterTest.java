package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
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
                //System.out.println("Месяц " + (m) + ". Денег " + (money) + ". Придётся работать. Заработал " + income + ", потратил -" + (expenses));
                money = money + income - expenses;
            } else {
                //System.out.println("Месяц " + (m) + ". Денег " + (money) + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + ((money - expenses) / 3));
                count++;
                money = (money - expenses) / 3;
            }
        }
        int actual = service.calculate(count);
        Assertions.assertEquals(expected, actual);
    }
}

