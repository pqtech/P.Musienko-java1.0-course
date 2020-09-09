package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        String str;

        // Вывод на экран строк из файла и сохранение в lines
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                lines.add(str);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        // Перезапись строк в массиве до конца массива или до ввода "стоп"
        Scanner sc = new Scanner(System.in);
        System.out.println("Для завершения ввода текста введите \"стоп\"");
        for (int i = 0; i < lines.size(); i++) {
            System.out.print(": ");
            str = sc.nextLine();
            if (str.equalsIgnoreCase("стоп")) break;
            lines.set(i, str);

        }

        // Запись результирующего массива строк в файл
        try (FileWriter fw = new FileWriter("file.txt")) {
            for (String string : lines) {
                fw.write(string + "\r\n");
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
