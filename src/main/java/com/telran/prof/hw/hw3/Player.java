package com.telran.prof.hw.hw3;

public class Player {

    private final String name;

    private final Card[] hand;

    private int cardCount;

    public Player(String name, int numOfCards) {
        this.name = name;
        this.hand = new Card[numOfCards];
        this.cardCount = 0;
    }

    public void receiveCard(Card[] cardsFromDeck) {
        if (cardsFromDeck != null) {
            for (int i = 0; i < cardsFromDeck.length; i++) {
                hand[i] = cardsFromDeck[i];
                cardCount++;
            }
        }
    }

    public void showHand() {
        System.out.println(name + " hand:");
        for (int i = 0; i < cardCount; i++) {
            System.out.println(hand[i]);
        }
        System.out.println();
    }
}
