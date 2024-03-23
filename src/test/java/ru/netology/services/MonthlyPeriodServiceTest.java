package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthlyPeriodServiceTest {
    @Test
    public void testCalcMonthly1() {
        MonthlyPeriodService service = new MonthlyPeriodService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculateMonthlyPeriod(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcMonthly2() {
        MonthlyPeriodService service = new MonthlyPeriodService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 3;
        int actual = service.calculateMonthlyPeriod(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
