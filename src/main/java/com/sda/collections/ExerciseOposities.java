package com.sda.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class ExerciseOposities {

    private static Map<String, String> map = new TreeMap<>();
    private static String text;
    private static int points = 0;

    public static void main(String[] args) throws IOException {
        map.put("cieply", "zimny");
        map.put("szybki", "wolny");
        map.put("duży", "mały");
        map.put("drogi", "tani");
        map.put("ciemny", "jasny");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for(String key : map.keySet()){
                System.out.println("Podaj przeciwieństwo do: " + key);
                String answer = br.readLine();
                if (answer.equals(map.get(key))){
                    ++points;
                }
            }
        }

        System.out.println("Twój wynik to " + points + "/" + map.size() + " points - " + (points*100)/map.size() + "%");

    }
}

