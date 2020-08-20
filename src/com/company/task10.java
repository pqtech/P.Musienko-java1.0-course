package com.company;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int[][] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество строк в матрице: ");
        int arraySizeX = sc.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int arraySizeY = sc.nextInt();
        array = new int[arraySizeX][arraySizeY];

        for (int i = 0; i < arraySizeX; i++) {
            for (int j = 0; j < arraySizeY; j++) {
                System.out.print("Введите элемент[" + i + "][" + j + "] массива: ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Элементы первой строки матрицы, умноженные на 3: ");
        for (int j = 0; j < arraySizeY; j++) {
            System.out.print((array[0][j] * 3) + " ");
        }
    }
}
