public class Card_1 extends Card
{    
    public Card_1()
    {
        super();
        cardName = "1";
        card.put("top", 'A');
        card.put("left", 'B');
        card.put("bottom", 'd');
        card.put("right", 'e');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'A') {
            card.replace("top", 'B');
            card.replace("left", 'd');
            card.replace("bottom", 'e');
            card.replace("right", 'A');
        }
        // case 2:
        else if(card.get("top") == 'B') {
            card.replace("top", 'd');
            card.replace("left", 'e');
            card.replace("bottom", 'A');
            card.replace("right", 'B');
        }
        // case 3:
        else if(card.get("top") == 'd') {
            card.replace("top", 'e');
            card.replace("left", 'A');
            card.replace("bottom", 'B');
            card.replace("right", 'd');
        }
        // case 4:
        else if(card.get("top") == 'e') {
            card.replace("top", 'A');
            card.replace("left", 'B');
            card.replace("bottom", 'd');
            card.replace("right", 'e');
        }
    }
}