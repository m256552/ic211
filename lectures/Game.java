import java.util.*;

public class Game {
    public static void main(String[] args){
        Random rand = new Random(System.currentTimeMillis());
        int [] D = Card.makeDeck();
        Card.shuffle(D, rand);
        int top = 0;
        Player pu = new Player();
        pu.money = 5.00;
        pu.card = D[top++];
        System.out.println("Player has $"
            + pu.money
            + " and card " 
            + Card.cardToString(pu.card));
    }
    
}
