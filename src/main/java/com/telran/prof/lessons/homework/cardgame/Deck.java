package com.telran.prof.lessons.homework.cardgame;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private int currentIndex;

    public Deck() {
        this.cards = new Card[Suit.values().length * Rank.values().length];
        this.currentIndex = 0;
        initializeDeck();
    }

    private void initializeDeck() {
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index++] = new Card(suit, rank);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentIndex >= cards.length) {
            throw new IllegalStateException("The deck is empty");
        }
        return cards[currentIndex++];
    }

    public int remainingCards() {
        return cards.length - currentIndex;
    }
}
