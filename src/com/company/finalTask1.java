package com.company;

import java.util.Scanner;

public class finalTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите двоичное число: ");
        String binNumber = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < binNumber.length(); i++) {
            char currentChar = binNumber.charAt(binNumber.length() - i - 1);
            if (currentChar == '1') {
                sum = sum + (int) Math.pow(2, i);
            } else if (currentChar != '0') {
                System.out.println("Введено некорректное двоичное число!");
                System.exit(0);
            }
            System.out.println(currentChar);
        }

        System.out.println("Двоичное число " + binNumber + " в десятичном формате равно " + sum);
    }
}
