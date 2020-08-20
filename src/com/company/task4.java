package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в двоичном формате: ");
        String binNumberStr = sc.nextLine();
        int decNumber = 0;
        for (int i = 0; i < binNumberStr.length(); i++) {
            decNumber <<= 1;
            if (binNumberStr.charAt(i) == '1') {
                decNumber++;
            }
        }
        System.out.println(decNumber);
    }
}
