package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("Welcome to Workshop_DeckOfCards!!");
        String player[] = {"Player 1", "Player 2", "Player 3", "Player 4"};
        String[] suit = {"Clubs", "Diamond", "Spades", "Hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] deck = new String[suit.length][rank.length];
        int card = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i][j] = suit[i] + " " + rank[j];
                System.out.println(deck[i][j]);
                card++;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of cards are:" + card);

    }
}





