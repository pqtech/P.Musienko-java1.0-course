package com.company;

import java.util.Scanner;

public class finalTask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        double currencyRate = sc.nextDouble();

        System.out.print("Введите сумму в рублях: ");
        double rublesSum = sc.nextDouble();

        double dollarsSum = rublesSum/currencyRate;
        System.out.printf("Итого долларов: %.2f", dollarsSum);
    }
}
