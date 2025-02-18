package com.telran.prof.lessons.homework.cardgame;

public class Player {
    private final String name;
    private Card[] hand;
    private int handSize;

    public Player(String name, int maxCards) {
        this.name = name;
        this.hand = new Card[maxCards];
        this.handSize = 0;
    }

    public String getName() {
        return name;
    }

    public void receiveCard(Card card) {
        if (handSize >= hand.length) {
            throw new IllegalStateException(name + " cannot hold more cards!");
        }
        hand[handSize++] = card;
    }

    public void showHand() {
        System.out.println(name + "'s hand:");
        for (int i = 0; i < handSize; i++) {
            System.out.println(hand[i]);
        }
        System.out.println();
    }
}
