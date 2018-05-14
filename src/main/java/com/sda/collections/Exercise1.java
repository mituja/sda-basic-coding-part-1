package com.sda.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exercise1 {

    private static String text;
    private static Set<String> set = new HashSet<>();
    private static List<String> list = new LinkedList<>();
    private static int count = 0;

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(text = br.readLine()).equalsIgnoreCase("exit")) {
                set.add(text);
                list.add(text);
                ++count;
            }
            System.out.println("Podanych napisów: " + count + ", Rozmiar kolekcji: " + set.size());
            System.out.println("Podanych napisów: " + count + ", Rozmiar kolekcji: " + list.size());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
