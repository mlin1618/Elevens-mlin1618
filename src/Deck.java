/**
 * Created by ml996 on 3/16/17.
 */
import java.util.*;
public class Deck {
    ArrayList<Card> a = new ArrayList<Card>();
    public int size;
    public Deck(String[] r, String[] s, int[] v){
        for(int i = 0; i < r.length; i++){
            for(int j = 0; j < s.length; j++){
                a.add(new Card(r[i], s[j], v[i]));
            }
        }
        size = a.size();
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
        return a.get(size);
    }
    public void shuffle(){

    }

}
