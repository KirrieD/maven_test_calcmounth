package ru.netology.services;

public class MonthlyPeriodService {
    public int calculateMonthlyPeriod(int income, int expenses, int threshold) {

        int mounts = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {

            if (money >= threshold) {

                money -= expenses;
                money = money / 3;
                mounts++;

            } else {
                money -= expenses;
                money += income;
            }
        }
        return mounts;
    }
}
