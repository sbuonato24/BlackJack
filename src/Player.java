import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class Player {

    public int cardCounter;
    public int score;
    public int nameNum;
    public ArrayList<Card> hand;
    public String Name;

    public Player(int pnameNum) {
        nameNum = pnameNum;
        hand = new ArrayList<Card>();

        Name = "Player " + Integer.toString(nameNum);
    }

    public void printHand() { //prints the cards in the players' hands
        for (int i = 0; i < hand.size(); i++) {
            hand.get(i).printCard();
        }
    }

    public int playerScore() { //asigns the player's hand's cards' score to the score variable
        score = 0;
        for (int i = 0; i < hand.size(); i++) {
            score += hand.get(i).pointValue;
        }

        return score;
    }
}
