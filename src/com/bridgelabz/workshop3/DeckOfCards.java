package com.bridgelabz.workshop3;

public class DeckOfCards {

    static String[] suit = {"Clubs", "Hearts", "Diamond", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[][] deckOfCards = new String[4][13];

    public void initializeCards() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deckOfCards[i][j] = suit[i] + ' ' + ranks[j];

            }
        }System.out.println("Number of cards in deck: ");
    }

    public void printCards() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                System.out.println(deckOfCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        Players players = new Players();
        cards.initializeCards();
        cards.printCards();
        players.players();

    }
}