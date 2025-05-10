package com.telran.prof.lessons.homework.cardgame;

import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int cardsPerPlayers = 6;
        int players;

        while (true) {
            System.out.println("Enter the number of players: ");
            players = scanner.nextInt();
            if (players <= 1) {
                System.out.println("The game has been terminated.");
                return;
            }
            if (players * cardsPerPlayers <= 52) {
                break;
            } else {
                System.out.println("Too many players for this game!");
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersArray = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player("Player " + (i + 1), cardsPerPlayers);
        }

        for (int i = 0; i < cardsPerPlayers; i++) {
            for (Player player : playersArray) {
                player.receiveCard(deck.dealCard());
            }
        }

        for (Player player : playersArray) {
            player.showHand();
        }
    }
}
