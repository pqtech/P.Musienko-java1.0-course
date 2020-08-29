package com.company;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = sc.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;

        System.out.println(S + "\n" + X + "\n" + Y);
    }
}
