import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList; // payment handler class

    public VendingMachine()
    {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public State getVendingMachinState()
    {
        return vendingMachineState;
    }

    public void setVendingMachineState(State state)
    {
        this.vendingMachineState = state;
    }

    public void setCoinList(ArrayList<Coin> coinList)
    {
        this.coinList = coinList;
    }

    public List<Coin> getCoinList()
    {
        return this.coinList;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }

    public Inventory getInventory()
    {
        return this.inventory;
    }   

}
