package com.company;

import java.util.Scanner;

public class task15 {
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

        for (int i = arraySize-1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println("\nВаш отсортированный по возрастанию массив: ");
        for (int e : array) { System.out.print(e + " "); }
    }
}
