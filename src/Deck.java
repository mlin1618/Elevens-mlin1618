/**
 * Created by ml996 on 3/16/17.
 */
import java.util.*;
public class Deck {
    private List<Card> cards = new ArrayList<Card>();
    private int size;
    public Deck(String[] r, String[] s, int[] v){
        for(int i = 0; i < r.length; i++){
            for(int j = 0; j < s.length; j++){
                cards.add(new Card(r[i], s[j], v[i]));
            }
        }
        size = cards.size();
        shuffle();
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }
    public int size(){
        return size;
    }
    public Card deal(){
        if(size==0)
            return null;
        size--;
        return cards.get(size);
    }
    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    }
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
