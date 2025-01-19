package com.telran.prof.lessons.lesson4.Homework4.dealhomework;

import com.telran.base.lesson11.Car;

import java.util.Random;

public class Deck {


    private Card[] cards;

    private int currentCardIndex;

    public Deck() {
        cards = new Card[Suit.values().length * Rank.values().length];
        int index = 0;

        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards[index++] = new Card(suit, rank);
            }
        }
        currentCardIndex = 0;
    }

    public void shuffle(){

        Random random = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card[] dealCards(int count){
        if (count > cards.length - currentCardIndex){
            System.out.println("Недостаточно карт в колоде!");
        }
        Card[] hand = new Card[count];

        for (int i = 0; i < count; i++) {
            hand[i] = cards[currentCardIndex + i];
        }
        currentCardIndex += count;
        return hand;
    }

    public int remainingCards() {
        return cards.length - currentCardIndex;
    }
}
