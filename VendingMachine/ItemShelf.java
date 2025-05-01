public class ItemShelf {

    Item item;
    int code;
    boolean soldOut;

    public Item getItem()
    {
        return item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }

    public boolean isSoldOut()
    {
        return soldOut;
    }

    public void setSoldOut(boolean sold)
    {
        this.soldOut = sold;
    }    
}
