package com.company;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int arraySize = sc.nextInt();
        array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент[" + i + "] массива: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Элементы введенного массива, умноженные на 2: ");
        for (int x : array) System.out.println(x * 2);
    }
}
