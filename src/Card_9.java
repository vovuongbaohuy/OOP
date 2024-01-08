public class Card_9 extends Card
{
    public Card_9()
    {
        super();
        cardName = "09";
        card.put("top", 'b');
        card.put("left", 'D');
        card.put("bottom", 'B');
        card.put("right", 'e');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'b') {
            card.replace("top", 'D');
            card.replace("left", 'B');
            card.replace("bottom", 'e');
            card.replace("right", 'b');
        }
        // case 2:
        else if(card.get("top") == 'D') {
            card.replace("top", 'B');
            card.replace("left", 'e');
            card.replace("bottom", 'b');
            card.replace("right", 'D');
        }
        // case 3:
        else if(card.get("top") == 'B') {
            card.replace("top", 'e');
            card.replace("left", 'b');
            card.replace("bottom", 'D');
            card.replace("right", 'B');
        }
        // case 4:
        else if(card.get("top") == 'e') {
            card.replace("top", 'b');
            card.replace("left", 'D');
            card.replace("bottom", 'B');
            card.replace("right", 'e');
        }
    }
}