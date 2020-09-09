package com.company;

import java.io.*;

public class task17 {
    public static void main(String[] args) {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода текста введите соответствующее слово");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.equalsIgnoreCase("стоп")) break;
                str = str + "\r\n";
                fw.write(str);
            } while (!str.equalsIgnoreCase("стоп"));
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}
