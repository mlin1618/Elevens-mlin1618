import java.util.*;

public class deckMaker {
    public static int getUserInt(String s, boolean positive){
        Scanner scans = new Scanner(System.in);
        String num;
        int x;
        while(true){
            System.out.println(s);
            num = scans.next();
            if(num.matches("^-?\\d+")) {
                x =Integer.parseInt(num);
                if(!positive)
                    break;
                else if (positive&&x>0) {
                    break;
                }
                System.out.println("Enter a positive integer please");
            }
            System.out.println("Not a valid integer, try again.");
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("how many of each suit: (enter integer)");
        int suitEach = getUserInt("how many of each suit: (enter positive integer)",true);
        //System.out.println("how many different suits: (enter integer)");
        int suitNum = getUserInt("how many different suits: (enter positive integer)",true);
        System.out.println("names of each suit:");
        ArrayList<String> suitNames = new ArrayList<String>();
        for(int i = 0; i < suitNum; i++){
            suitNames.add(sc.nextLine());
        }
        int lowest = getUserInt("enter lowest card value: ",false);
        //int highest = getUserInt("enter highest card: ", false);
        System.out.println("standard face? ace, jack, king, queen? enter 'yes' for yes, anything else for no");
        boolean b = sc.nextLine().equalsIgnoreCase("yes")? true:false;
        String[] faces = {"jack", "king", "queen", "ace"};
        ArrayList<String> extraCardNames = new ArrayList<String>();
        ArrayList<Integer> extraCardNums = new ArrayList<Integer>();
        System.out.println("Extra cards? enter 'yes' for yes, anything else for no");
        boolean b2 = sc.nextLine().equalsIgnoreCase("yes")? true:false;
        if(b2){
            loop30:while(true) {
                System.out.println("enter extra card name (enter 'stop' here to stop entering extra cards)");
                String sa = sc.nextLine();
                if (sa.equalsIgnoreCase("stop"))
                    break loop30;
                extraCardNames.add(sa);
                extraCardNums.add(getUserInt("enter how many",false));
            }
        }
        //String extra = sc.next();
        //int extraAmount = sc.nextInt();
        for(int i = 0; i < suitNames.size(); i++){
            for(int j = 0; j < suitEach; j++){
                System.out.println(lowest + j + " of " + suitNames.get(i));
            }
            if(b){
                for(int j = 0; j < faces.length; j++){
                    System.out.println(faces[j] + " of " + suitNames.get(i));
                }
            }
        }
        for(int i = 0; i < extraCardNames.size(); i++){
            for(int j = 0; j < extraCardNums.get(i); j++){
                System.out.println(extraCardNames.get(i));
            }
        }
    }
}