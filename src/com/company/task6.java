package com.company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = sc.nextInt();
        System.out.println("Введите y: ");
        int y = sc.nextInt();
        System.out.println("Введите z: ");
        int z = sc.nextInt();
        float mean = (float) (x + y + z) / 3;

        System.out.println("Среднее арифметическое: " + mean);
        int m = (int) mean / 2;
        if (m > 3) System.out.println("Программа выполнена корректно");
    }
}
