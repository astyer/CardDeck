package com.company;


public class Card {

    public String rank;
    public String suit;

    public Card(String cardRank, String cardSuit) {
        rank = cardRank;
        suit = cardSuit;
    }

    public String printable()
    {
        return rank + " of " + suit;
    }
}
