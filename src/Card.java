public class Card {

    public int type;
    public int suit;
    public String suitName;
    public String typeName;
    public int pointValue;

    public Card(int ctype, int csuit) {
        type = ctype;
        suit = csuit;
    }


    public void printCard() {
        if (type<11){
            pointValue = type;
        }
        else {
            pointValue = 10;
        }

        if (suit == 0){
            suitName = "hearts";
        }
        if (suit == 1){
            suitName = "diamonds";
        }
        if (suit == 2){
            suitName = "spades";
        }
        if (suit == 3){
            suitName = "clubs";
        }
        if (type == 1){
            typeName = "ace";
        }
        if (type == 2){
            typeName = "two";
        }
        if (type == 3){
            typeName = "three";
        }
        if (type == 4){
            typeName = "four";
        }
        if (type == 5){
            typeName = "five";
        }
        if (type == 6){
            typeName = "six";
        }
        if (type == 7){
            typeName = "seven";
        }
        if (type == 8){
            typeName = "eight";
        }
        if (type == 9){
            typeName = "nine";
        }
        if (type == 10){
            typeName = "ten";
        }
        if (type == 11){
            typeName = "jack";
        }
        if (type == 12){
            typeName = "queen";
        }
        if (type == 13){
            typeName = "king";
        }
        System.out.println(typeName + " of " + suitName);
    }
}
