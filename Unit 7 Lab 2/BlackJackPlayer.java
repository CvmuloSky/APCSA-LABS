//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

import java.util.*;


@SuppressWarnings("rawtypes")
public class BlackJackPlayer implements Comparable {
    private String name;
    private ArrayList<Card> hand;
    private int value;
    private double balance;
    public BlackJackPlayer(String n) {
        name = n;
        hand = new ArrayList<Card>();
        value = 0;
        balance = 100;
    }

    public BlackJackPlayer(String n, double d) {
        name = n;
        hand = new ArrayList<Card>();
        value = 0;
        balance = d;
    }

    public void hit(Deck d) {
        hand.add(d.deal());
    }

    public void setValue() {
        value = 0;
        for (int i = 0; i < hand.size(); i++) {
            value += (hand.get(i)).getVal();
        }
    }

    public boolean reduceAce() {
        boolean hasAce = false;
        for (int i = 0; i < hand.size(); i++) {
            if (((hand.get(i)).getVal()) == 11) {
                (hand.get(i)).aceReducer();
                hasAce = true;
            }
        }
        return hasAce;
    }

    public boolean busted() {
        return getValue() > 21;
    }

    public void returnToDeck(Deck d) {

        for (int i = 0; i < hand.size(); i++) {
            d.reStack((hand.remove(0)));
        }
        hand.clear();
    }

    public void setWinnings(double d)
    {
        balance += d;
    }

    public Card getFirstCard() {
        return hand.get(0);
    }

    public int getValue() {
        setValue();
        return value;
    }

    public String getName() {
        return name;
    }

    public double getWinnings(){
        return balance;
    }

    @Override
    public String toString() {
        String cardtoS = "";
        for (int i = 0; i < hand.size(); i++) {
            cardtoS = cardtoS + (hand.get(i)).toString() + " ";
        }
        String toS = name + " has cards:\n" + cardtoS + "\n";
        return toS;
    }

    @Override
    public int compareTo(Object o) {
        BlackJackPlayer temp = (BlackJackPlayer)o;
        return this.getValue() - temp.getValue();
    }

}