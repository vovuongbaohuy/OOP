public class Card_6 extends Card
{
    public Card_6()
    {
        super();
        cardName = "6";
        card.put("top", 'b');
        card.put("left", 'e');
        card.put("bottom", 'D');
        card.put("right", 'A');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'b') {
            card.replace("top", 'e');
            card.replace("left", 'D');
            card.replace("bottom", 'A');
            card.replace("right", 'b');
        }
        // case 2:
        else if(card.get("top") == 'e') {
            card.replace("top", 'D');
            card.replace("left", 'A');
            card.replace("bottom", 'b');
            card.replace("right", 'e');
        }
        // case 3:
        else if(card.get("top") == 'D') {
            card.replace("top", 'A');
            card.replace("left", 'b');
            card.replace("bottom", 'e');
            card.replace("right", 'D');
        }
        // case 4:
        else if(card.get("top") == 'A') {
            card.replace("top", 'b');
            card.replace("left", 'e');
            card.replace("bottom", 'D');
            card.replace("right", 'A');
        }
    }
}