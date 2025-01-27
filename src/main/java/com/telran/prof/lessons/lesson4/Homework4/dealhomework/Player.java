package com.telran.prof.lessons.lesson4.Homework4.dealhomework;

public class Player {

    private Card[] cards;

    private String number;

    public Player(String number, int size) {
        this.number = number;
        this.cards = new Card[size];
    }

    public void receiveCards(Card[] newCards) {
        if (newCards.length > cards.length){
            System.out.println("Много карт!");
        }
        for (int i = 0; i < cards.length; i++) {
            newCards[i] = cards[i];
        }
    }
    public void showHand() {
        System.out.println(number + " получает: ");
        for (Card card : cards) {
                System.out.println(card.getToString()); //Проблема тут, у меня вместо вывода карт выводит null!!!
        }
        System.out.println();
    }
}
