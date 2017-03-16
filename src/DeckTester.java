/**
 * Created by ml996 on 3/16/17.
 */
public class DeckTester {
    public static void main(String[] args){
        Deck x = new Deck(new String[]{"q","w", "e","r"}, new String[]{"t","y","u","i"}, new int[]{0,1,2,3});
        Deck y = new Deck(new String[]{"a","b","c"}, new String[]{"+++", "---"}, new int[]{0,1,2});
        Deck z = new Deck(new String[]{"asdf", "fdsa"}, new String[]{"Giraffes!"}, new int[]{42,1337});
        System.out.println(x.size()+ " " + y.size()+ " " +z.size());
        System.out.println(x.isEmpty() + " " + y.isEmpty() + " " + z.isEmpty());
        System.out.println(x.deal().toString() +"\t" + y.deal().toString() + "\t" + z.deal().toString());
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
    }
}
