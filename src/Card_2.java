public class Card_2 extends Card
{    
    public Card_2()
    {
        super();
        cardName = "02";
        card.put("top", 'd');
        card.put("left", 'b');
        card.put("bottom", 'E');
        card.put("right", 'A');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'd') {
            card.replace("top", 'b');
            card.replace("left", 'E');
            card.replace("bottom", 'A');
            card.replace("right", 'd');
        }
        // case 2:
        else if(card.get("top") == 'b') {
            card.replace("top", 'E');
            card.replace("left", 'A');
            card.replace("bottom", 'd');
            card.replace("right", 'b');
        }
        // case 3:
        else if(card.get("top") == 'E') {
            card.replace("top", 'A');
            card.replace("left", 'd');
            card.replace("bottom", 'b');
            card.replace("right", 'E');
        }
        // case 4:
        else if(card.get("top") == 'A') {
            card.replace("top", 'd');
            card.replace("left", 'b');
            card.replace("bottom", 'E');
            card.replace("right", 'A');
        }
    }
}