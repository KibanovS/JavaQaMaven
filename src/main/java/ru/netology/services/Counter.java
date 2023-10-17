package ru.netology.services;

public class Counter {

    public int calculate(int count) {
        count = 0;
        int money = 0;
        int thrshold = 150_000;
        int expenses = 60_000;
        int income = 100_000;
        for (int m = 1; m < 13; m++) {
            if (money < thrshold) {
                System.out.println("Месяц " + (m) + ". Денег " + (money) + ". Придётся работать. Заработал " + income + ", потратил -" + (expenses));
                money = money + income - expenses;
            } else {
                System.out.println("Месяц " + (m) + ". Денег " + (money) + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + ((money - expenses) / 3));
                count++;
                money = (money - expenses) / 3;
            }
        }
        System.out.println("Месяцев отдыха в год - " + (count));
        return count;
    }
}





