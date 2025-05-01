import java.util.List;

public class DispenseItemState implements State{

    DispenseItemState()
    {
        System.out.println("Dispense Item State ");
    }

    DispenseItemState(VendingMachine vm)
    {
        System.out.println("Dispense Item State ");
    }

    public void dispenseItem(VendingMachine vm)
    {
        System.out.println("Product dispensed, Inventory updated");
        vm.setVendingMachineState(new IdleState());
    }

    public List<Coin> refund(VendingMachine vm)
    {
        vm.setVendingMachineState(new IdleState());
        return vm.getCoinList();
    }

    @Override
    public void pushToInsertCoin(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pushToInsertCoin'");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void back(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'back'");
    }

    @Override
    public double getChange(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void goToSelectProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goToSelectProduct'");
    }
    
}
