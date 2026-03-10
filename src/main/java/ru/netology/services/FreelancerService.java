package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int treshold) {
        int counter = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= treshold) {
                // отдыхаем
                money = money - expenses;
                money = money /3;
                counter++;
            }else {
                // работаем
                money += income;
                money -= expenses;

            }

        }
        return counter;
    }
}
