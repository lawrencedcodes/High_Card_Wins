public class Card {
    public static final int Ace = 1;
    public static final int Jack = 11;
    public static final int Queen = 12;
    public static final int King = 13;
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;

    public Card(int v, int s) {
        value = v;
        suit = s;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public int rank() {
        if (value == ACE) {
            return 4*13 + suit;
        } else {
            return 4* (value-1) + suit;
        }
    }

    public String toString() {
        String v;
        String s;
        if (value == ACE) {
            v = "Ace";
        } else if (value==JACK) {
                v = "Jack";
        } else if (value==QUEEN) {
            v = "Queen";
        } else if (value==KING) {
            v = "King";
        } else v = String.valueOf(value);
        if (suit == DIAMONDS) {
            s = "Diamonds";
        } else if (suit == HEARTS) {
            s = "Hearts";
        } else if (suit == SPADES) {
            s = "Spades";
        } else if (suit == CLUBS) {
            s = "Clubs";
        }
        return v + " of " + s;
    }
    private int value;
    private int suit;
}