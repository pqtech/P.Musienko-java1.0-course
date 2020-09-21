package com.company;

import java.util.Scanner;

public class finalTask2 {
    public static void main(String[] args) {

        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arraySize = sc.nextInt();
        array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент[" + i + "] массива: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Ваш неотсортированный массив: ");
        for (int e : array) { System.out.print(e + " "); }

        // Сортировка вставками
        int temp;
        int j;
        for(int i = 0; i < arraySize - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }

        System.out.println("\nВаш отсортированный по возрастанию массив: ");
        for (int e : array) { System.out.print(e + " "); }
    }
}
