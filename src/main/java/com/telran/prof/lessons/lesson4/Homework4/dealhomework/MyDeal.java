package com.telran.prof.lessons.lesson4.Homework4.dealhomework;

import java.util.Random;
import java.util.Scanner;

public class MyDeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int cardsForPlayer = 5;
        int players;

        while (true) {
            System.out.println("Введите количество игроков: ");

            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                if (cardsForPlayer * players <= Suit.values().length * Rank.values().length) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("Игра прекращена.");
                        return;
                    } else if (players < 0) {
                        System.out.println("Количество игроков не может быть меньше 0");
                    } else if (cardsForPlayer * players > Suit.values().length * Rank.values().length){
                        System.out.println("Слишком много игроков!");
                    }
                }
            } else {
                System.out.println("Вы не ввели число, или оно слишком большое!\n");
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersArr = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArr[i] = new Player("Игрок " + (i + 1), cardsForPlayer);
        }

        for (Player player : playersArr){
            player.receiveCards(deck.dealCards(cardsForPlayer));
        }

        for (Player player : playersArr){
            player.showHand();
        }

    }
}
