public class Card_4 extends Card
{  
    public Card_4()
    {
        super();
        cardName = "04";
        card.put("top", 'D');
        card.put("left", 'B');
        card.put("bottom", 'e');
        card.put("right", 'a');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'D') {
            card.replace("top", 'B');
            card.replace("left", 'e');
            card.replace("bottom", 'a');
            card.replace("right", 'D');
        }
        // case 2:
        else if(card.get("top") == 'B') {
            card.replace("top", 'e');
            card.replace("left", 'a');
            card.replace("bottom", 'D');
            card.replace("right", 'B');
        }
        // case 3:
        else if(card.get("top") == 'e') {
            card.replace("top", 'a');
            card.replace("left", 'D');
            card.replace("bottom", 'B');
            card.replace("right", 'e');
        }
        // case 4:
        else if(card.get("top") == 'a') {
            card.replace("top", 'D');
            card.replace("left", 'B');
            card.replace("bottom", 'e');
            card.replace("right", 'a');
        }
    }
}