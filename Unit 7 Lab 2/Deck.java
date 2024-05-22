//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

import java.util.*;

public class Deck {
    ArrayList<Card> dOCards;
    public Deck() {
        String[] suit = { "Spades", "Clubs", "Hearts", "Diamonds" };
        String[] name = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack" };
        dOCards = new ArrayList<Card>();
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                dOCards.add(new Card(suit[j], name[i]));
            }
        }
    }
    public void shuffle() {
        ArrayList<Card> right = new ArrayList<Card>();
        ArrayList<Card> left = new ArrayList<Card>();
        int cuts = (int) (Math.random() * 3) + 2;
        for (int i = 0; i < cuts; i++) {
            right = new ArrayList<Card>();
            left = new ArrayList<Card>();
            // making 2 subdecks
            int middle = (int) (Math.random() * 11) + 21;
            for (int j = 0; j < middle; j++) {
                left.add(dOCards.get(j));
            }
            for (int j = middle; j < dOCards.size(); j++) {
                right.add(dOCards.get(j));
            }
            // REPILING CARDS
            for (int j = 0; j < dOCards.size(); j++) {
                if (!right.isEmpty() && !left.isEmpty()) 
                {
                    dOCards.set(j, right.remove(0));
                    j++;
                    dOCards.set(j, left.remove(0));
                }
                else if (right.isEmpty() && !left.isEmpty())
                {
                    dOCards.set(j, left.remove(0));
                }
                else if (left.isEmpty() && !right.isEmpty())
                {
                    dOCards.set(j, right.remove(0));
                }
            }
        }
    }
    public ArrayList<Card> getDeck()
    {
        return dOCards;
    }
    public Card deal()
    {
        return dOCards.remove(0);
    }
    public void reStack(Card c)
    {
        dOCards.add(c);
    }
    @Override
    public String toString()
    {
        String deck = "";
        for (int i = 0; i < dOCards.size(); i++) {
            deck = deck + dOCards.get(i) + "\n";
        }
        return deck;
    }
}
