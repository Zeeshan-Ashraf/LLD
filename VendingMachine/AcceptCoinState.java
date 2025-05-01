import java.util.List;

public class AcceptCoinState implements State{

    public AcceptCoinState()
    {
        System.out.println("Vending Machine is in the Accept Coin state");
    }

    public AcceptCoinState(VendingMachine vm)
    {
        System.out.println("Vending Machine is in the Accept Coin state");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin)
    {
        System.out.println("Inserting coin");
        vm.getCoinList().add(coin);
    }

    @Override
    public double getChange(VendingMachine vm)
    {
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public List<Coin> refund(VendingMachine vm)
    {
        vm.setVendingMachineState(new IdleState());
        return vm.getCoinList();
    }

    @Override
    public void back(VendingMachine vm) {
        vm.setVendingMachineState(new IdleState());        
    }

    @Override
    public void dispenseItem(VendingMachine vm) 
    {
        throw new UnsupportedOperationException("Not applicable from Accept Coin state");        
    }

    @Override
    public void pushToInsertCoin(VendingMachine vm) 
    {
        throw new UnsupportedOperationException("Not applicable from Accept Coin state");
    }

    @Override
    public void selectProduct(VendingMachine vm) {
        throw new UnsupportedOperationException("Unimplemented method 'SelectProduct'");
    }

    @Override
    public void goToSelectProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        vm.setVendingMachineState(new ProductSelectionState(vm)); 
    }
}
