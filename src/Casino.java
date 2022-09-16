import java.util.ArrayList;

public class Casino {
    public Card[] Deck;
    public int deckCounter=0;
    public int cardCounter;
    public Player Dealer;
    public Player[] Players;

    public static void main(String[] args) {
        Casino app = new Casino();
    }

    public Casino() {
        Deck = new Card[52];
        Players = new Player[2];
        for (int player = 0; player < Players.length; player ++) { //this loop names an array of players using the loop's value
            Players[player] = new Player(player);
        }

        for (int suit = 0; suit <= 3; suit++) {
            for (int type = 1; type <= 13; type++) {
                Deck[cardCounter] = new Card(type, suit);
                cardCounter++;
            }
        }
        shuffleDeck();
        deal();
    }

    public void deal() { //assigns cards to players from the deck using nested loops
        Dealer = new Player(0);

        for(int x = 0; x < 2; x = x + 1){
            for (int i = 0; i <= Players.length; i = i + 1) {

                if (i == Players.length) {
                    Dealer.hand.add(Deck[deckCounter]);
                    deckCounter++;
                } else {
                    Players[i].hand.add(Deck[deckCounter]);
                    deckCounter++;
                }
            }
        }
        for (int p = 0; p <= Players.length; p = p + 1) { //this nested loop prints the dealer and players' hands
            if (p == Players.length) {
                System.out.println("Dealer's hand:");
                Dealer.printHand();
                Dealer.playerScore();
                System.out.println(Dealer.score);
            } else {
                System.out.println("Player " + p + "'s hand: ");
                Players[p].printHand();
                Players[p].playerScore();
                System.out.println(Players[p].score);
            }
        }
    }



    public void printDeck() {
        for (int i = 0; i < Deck.length; i++) {
            Deck[i].printCard();
        }
    }

    public void shuffleDeck() { //this method creates a shuffled deck of 52 cards using a loop
        int max = 51;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < 51; i++) {
            int rand = (int) (Math.random() * range) + min;
            var shuffled = Deck[i];
            Deck[i] = Deck[rand];
            Deck[rand] = shuffled;
            cardCounter++;
        }
    }

}
