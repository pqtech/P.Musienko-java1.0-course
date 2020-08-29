package com.company;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String inputStr1 = sc.nextLine();
        System.out.println("Введите строку 2: ");
        String inputStr2 = sc.nextLine();

        if (inputStr1.length() > inputStr2.length()) {
            System.out.println("Строка с наибольшей длиной: \n" + inputStr1);
        } else if (inputStr2.length() > inputStr1.length()) {
            System.out.println("Строка с наибольшей длиной: \n" + inputStr2);
        } else {
            System.out.println("Длины введенных строк равны!");
        }
    }
}
