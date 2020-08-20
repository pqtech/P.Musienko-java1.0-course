package com.company;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        final int X = 1;
        final int Y = 3;
        final int Z = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = sc.nextInt();

        switch (input) {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}
