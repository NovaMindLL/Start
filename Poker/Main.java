package Poker;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сколько игроков?");
        Scanner sc = new Scanner(System.in);
        int player = 0;
        try {
            player = sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка введите число игроков");
        } finally {
            sc.close();
        }
        String[] suits = { "Пик", "Бубен", "Черв", "Треф" }; // масти
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" }; // номиналы

        String[] koloda = new String[suits.length * ranks.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                koloda[index] = suits[i] + " " + ranks[j];
                index++;
            }
        }
        List<String> list = Arrays.asList(koloda);
        Collections.shuffle(list);
        int n = 2;
        for (int i = 0; i < player; i++) {
            int start = i * n;
            int end = start + n;
            List<String> razd = list.subList(start, end);
            System.out.println("Игрок" + (i + 1) + ": " + razd);
        }
    }
}
