package com.company;

import java.io.*;

public class task16 {
    public static void main(String[] args) {

        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
