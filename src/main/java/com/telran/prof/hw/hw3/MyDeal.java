package com.telran.prof.hw.hw3;

import java.util.Scanner;

public class MyDeal {

    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);

        final Suit[] suits = Suit.values();
        final Rank[] rank = Rank.values();

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= suits.length * rank.length) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersArray = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player("Player " + (i + 1), cardsForPlayer);
        }

        for (Player player : playersArray) {
            player.receiveCard(deck.dealCard(cardsForPlayer));
        }

        for (Player player : playersArray) {
            player.showHand();
        }
    }
}
