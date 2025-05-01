import java.util.List;

public class IdleState implements State{

    public IdleState()
    {
        System.out.println("Vending machine is in Idle state");
    }

    public IdleState(VendingMachine vm)
    {
        System.out.println("Vending machine is in Idle state");
    }
    
    @Override
    public void pushToInsertCoin(VendingMachine vm)
    {
        System.out.println("Going to Accept Coin state");
        vm.setVendingMachineState(new AcceptCoinState());
    }
    @Override
    public void back(VendingMachine vm) {
        throw new UnsupportedOperationException("Not applicable from Idle state");
    }
    @Override
    public void dispenseItem(VendingMachine vm){
        
        throw new UnsupportedOperationException("Not applicable from Idle state");
    }
    @Override
    public double getChange(VendingMachine vm){
        throw new UnsupportedOperationException("Not applicable from Idle state");
    }
    @Override
    public void insertCoin(VendingMachine vm, Coin coin){
        throw new UnsupportedOperationException("Not applicable from Idle state");
        
    }
    @Override
    public List<Coin> refund(VendingMachine vm){
        throw new UnsupportedOperationException("Not applicable from Idle state");
        
    }

    @Override
    public void selectProduct(VendingMachine vm){
        throw new UnsupportedOperationException("Not applicable from Idle state");        
    }

    @Override
    public void goToSelectProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goToSelectProduct'");
    }


}
