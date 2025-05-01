import java.util.List;

public interface State {

    public void pushToInsertCoin(VendingMachine vm);
    public void insertCoin(VendingMachine vm, Coin coin);
    public void selectProduct(VendingMachine vm);
    public List<Coin> refund(VendingMachine vm);
    public void back(VendingMachine vm);
    public double getChange(VendingMachine vm);
    public void dispenseItem(VendingMachine vm);
    public void goToSelectProduct(VendingMachine vm);
}