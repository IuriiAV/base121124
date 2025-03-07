package com.telran.prof.hw.hw3;

import java.util.Random;

public class Deck {

    private final Random random = new Random();

    private Card[] cards;

    private int currentCardIndex;

    public Deck() {
        cards = new Card[Rank.values().length * Suit.values().length];
        int index = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[index++] = new Card(suit, rank);
            }
        }
        currentCardIndex = 0;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length - 1; i++) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card[] dealCard(int num) {
        if (currentCardIndex + num > cards.length) {
            return null;
        }
        Card[] hand = new Card[num];
        for (int i = 0; i < num; i++) {
            hand[i] = cards[currentCardIndex++];
        }
        return hand;
    }

    public int remainingCards() {
        return cards.length - currentCardIndex;
    }
}
