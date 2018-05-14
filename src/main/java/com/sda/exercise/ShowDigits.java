// Napisać zadanie wczytujące z konsoli ciąg znaków
// Następnie parsujemy ten ciąg na liczbę Integer
// Sprawdzamy co się stanie w przypadku niepowodzenia
// Następnie wyświetlamy od 5 do 10 znaku ze stringa, wczesniej sprawdzajac jego dlugosc

// Zmodyfikować metodę IP adres żeby wyrzucała własny wyjątek gdy ip jest nieprawidłowe

package com.sda.exercise;

import java.util.Scanner;

public class ShowDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swojego stringa: ");
        String userString = scanner.nextLine();

        try {
            long number = Long.parseLong(userString);
            if (userString.length() >= 10){
                System.out.println(userString.substring(4,9));
            } else {
                System.out.println("Zły format stringa");
            }

        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("Zły format stringa" + e.getMessage());
        }

    }
}

