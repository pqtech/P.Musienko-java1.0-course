package com.company;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, содержащую пробелы: ");
        String inputStr = sc.nextLine();
        String resultStr = inputStr.replace(" ", "");

        System.out.println("Введенная строка без пробелов: \n" + resultStr);
    }
}
