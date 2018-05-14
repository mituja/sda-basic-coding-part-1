package com.sda.exercise;

import com.sda.exceptions.BadIPAdress;

import java.util.Scanner;

public class IPAdress {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            try {
                System.out.println("Podaj adres IP: ");
                String userIP = scanner.nextLine();
                System.out.println(isIPAdress(userIP));

            } catch (Exception e) {     // Niezależnie od tego jaki wyjątek poleci z klasy Exception zostanie wrzucony do konsoli
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
            i++;
        }
    }

    public static boolean isIPAdress(String userIP) throws BadIPAdress {
        if (userIP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String[] numbers = userIP.split("\\.");

            for (String number : numbers) {
                Integer num = Integer.parseInt(number);

                if (num < 0 || num > 255) {
                    throw new BadIPAdress("Zły adres IP");
                }

            }
            return true;
        } else {
            throw new BadIPAdress("Zły adres IP");
        }
    }
}

