package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancersServiceTest {
    @Test
    public void testCalculateCase1() {

        FreelancersService service = new FreelancersService();
        int income = 10_000;
        int expenses = 3_000;
        int trashold = 20_000;

        int actual = service.calculate(income, expenses, trashold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCalculateCase2() {

        FreelancersService service = new FreelancersService();
        int income = 100_000;
        int expenses = 60_000;
        int trashold = 150_000;

        int actual = service.calculate(income, expenses, trashold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}