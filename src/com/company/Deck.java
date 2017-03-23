package com.company;
import java.util.*;

public class Deck {

    public ArrayList cards = new ArrayList<Card>();
    public Deck(String[] ranks, String[] suits, int numOfEachSuit) {
        int j = 0;
        while(j<numOfEachSuit)
        {
            for(int i = 0; i < suits.length; i++)
            {
                for(int x = 0; x < ranks.length; x++)
                {
                    Card dummy = new Card(ranks[x], suits[i]);
                    cards.add(dummy);
                }
            }
            j++;
        }
    }

}
