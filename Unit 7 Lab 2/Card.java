//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

public class Card {
    String suit;
    String name;
    int val;

    public Card(String s, String n) {
        suit = s;
        name = n;
        setVal();
    }

    public void setVal() {
        if (name.equals("Ace")) {
            val = 11;
        } else if (name.equals("Jack")) {
            val = 10;
        } else if (name.equals("Queen")) {
            val = 10;
        } else if (name.equals("King")) {
            val = 10;
        } else {
            val = Integer.parseInt(name);
        }
    }

    public void aceReducer() {
        val = 1;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return name + " of " + suit + ",";

    }
}