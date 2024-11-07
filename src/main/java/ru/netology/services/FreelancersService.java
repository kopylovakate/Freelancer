package ru.netology.services;


public class FreelancersService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                //отдыхать
                balance -= expenses;
                balance /= 3;
                counter++;

            } else {
           //работать
                balance += income;
                balance -= expenses;

            }
        }

        return counter;

    }
}
