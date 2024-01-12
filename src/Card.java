import java.util.LinkedHashMap;
import java.util.Objects;

public class Card
{
    protected LinkedHashMap<String, Character> card;
    protected String cardName;
    public Frame2 frame2;
    public Card()
    {
        this.card = new LinkedHashMap<>();
        this.cardName = new String();
    }
    
    public void printCard()
    {
        System.out.println(this.card);
    }
    
    public String getCardName()
    {
        return this.cardName;
    }
    
    public Character getTopValue()
    {
        return this.card.get("top");
    }
    
    public Character getLeftValue()
    {
        return this.card.get("left");
    }
    
    public Character getBottomValue()
    {
        return this.card.get("bottom");
    }
    
    public Character getRightValue()
    {
        return this.card.get("right");
    }

}