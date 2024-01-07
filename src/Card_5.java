public class Card_5 extends Card
{   
    public Card_5()
    {
        super();
        cardName = "05";
        card.put("top", 'd');
        card.put("left", 'B');
        card.put("bottom", 'A');
        card.put("right", 'e');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'd') {
            card.replace("top", 'B');
            card.replace("left", 'A');
            card.replace("bottom", 'e');
            card.replace("right", 'd');
        }
        // case 2:
        else if(card.get("top") == 'B') {
            card.replace("top", 'A');
            card.replace("left", 'e');
            card.replace("bottom", 'd');
            card.replace("right", 'B');
        }
        // case 3:
        else if(card.get("top") == 'A') {
            card.replace("top", 'e');
            card.replace("left", 'd');
            card.replace("bottom", 'B');
            card.replace("right", 'A');
        }
        // case 4:
        else if(card.get("top") == 'e') {
            card.replace("top", 'd');
            card.replace("left", 'B');
            card.replace("bottom", 'A');
            card.replace("right", 'e');
        }
    }
}