public class Card_8 extends Card
{
    public Card_8()
    {
        super();
        cardName = "08";
        card.put("top", 'd');
        card.put("left", 'a');
        card.put("bottom", 'E');
        card.put("right", 'B');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'd') {
            card.replace("top", 'a');
            card.replace("left", 'E');
            card.replace("bottom", 'B');
            card.replace("right", 'd');
        }
        // case 2:
        else if(card.get("top") == 'a') {
            card.replace("top", 'E');
            card.replace("left", 'B');
            card.replace("bottom", 'd');
            card.replace("right", 'a');
        }
        // case 3:
        else if(card.get("top") == 'E') {
            card.replace("top", 'B');
            card.replace("left", 'd');
            card.replace("bottom", 'a');
            card.replace("right", 'E');
        }
        // case 4:
        else if(card.get("top") == 'B') {
            card.replace("top", 'd');
            card.replace("left", 'a');
            card.replace("bottom", 'E');
            card.replace("right", 'B');
        }
    }
}