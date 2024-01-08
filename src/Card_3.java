public class Card_3 extends Card
{   
    public Card_3()
    {
        super();
        cardName = "03";
        card.put("top", 'E');
        card.put("left", 'A');
        card.put("bottom", 'd');
        card.put("right", 'b');
    }
    
    public void rotateRight()
    {
        // case 1:
        if(card.get("top") == 'E') {
            card.replace("top", 'A');
            card.replace("left", 'd');
            card.replace("bottom", 'b');
            card.replace("right", 'E');
        }
        // case 2:
        else if(card.get("top") == 'A') {
            card.replace("top", 'd');
            card.replace("left", 'b');
            card.replace("bottom", 'E');
            card.replace("right", 'A');
        }
        // case 3:
        else if(card.get("top") == 'd') {
            card.replace("top", 'b');
            card.replace("left", 'E');
            card.replace("bottom", 'A');
            card.replace("right", 'd');
        }
        // case 4:
        else if(card.get("top") == 'b') {
            card.replace("top", 'E');
            card.replace("left", 'A');
            card.replace("bottom", 'd');
            card.replace("right", 'b');
        }
    }
}