import java.util.Random;
import java.util.*;

public class CardDeck {
    public CardDeck() {
        deck = new Card[52];
        fill();
        shuffle();
    }

    public void fill() {
        int i;
        int j;
        for (i=1; i<=13; i++) {
            for (j=1; j<=4; j++) {
                deck[4*(i-1)+j-1] = new Card(i,j);
            }
        }
        cards = 52;
    }

    public void shuffle() {
        int next;
        for (next=0; next<cards-1; next++) {
            int r = new RandomIntGenerator(next, cards-1).draw();
            Card temp = deck[next];
            deck[next] = deck[r];
            deck[r] = temp;
        }
    }

    public Card draw() {
        if (cards==0) return null; {
            cards--;  
        }
        return deck[cards];
    }

    public void play(int rounds) {
        int i;
        int wins = 0;
        for (i=1; i<=rounds; i++) {
            Card yours = draw();
            System.out.println("Your draw: "+yours+" ");
            Card mine = draw();
            System.out.println("My draw: "+mine+" ");
            if (yours.rank() > mine.rank()) {
                System.out.println("You win!");
                wins++;
            }  else {
                System.out.println("I win!");
            }
            System.out.println("Your wins: "+wins+" and mine are: "+(rounds-wins));
        }
    }

    public static void main(String[] args) {
        CardDeck d = new CardDeck();
        //play 10 rounds
        d.play(10);
    }

    private Card[] deck;
    private int cards;
}