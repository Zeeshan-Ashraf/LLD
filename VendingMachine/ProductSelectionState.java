import java.util.List;

public class ProductSelectionState implements State{

    ProductSelectionState()
    {
        System.out.println("Product Selection State");
    }

    ProductSelectionState(VendingMachine vm)
    {
        System.out.println("Product Selection State");
    }

    public List<Coin> refund(VendingMachine vm)
    {
        vm.setVendingMachineState(new IdleState());
        return vm.getCoinList();
    }

    public void back(VendingMachine vm)
    {
        vm.setVendingMachineState(new AcceptCoinState());
    }

    public void goToSelectProduct(VendingMachine vm)
    {
        throw new UnsupportedOperationException("Unimplemented method 'goToSelectProduct'");
    }

    public void selectProduct(VendingMachine vm)
    {
        System.out.println("Product is selected");
        vm.setVendingMachineState(new DispenseItemState(vm));
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
    public double getChange(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseItem'");
    }
    
}
