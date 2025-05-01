
public class Main {
    public static void main(String[] args) {

        System.out.println("======State of the Vending machine=====");
        
        VendingMachine vm = new VendingMachine();

        System.out.println("========Changing the state of the vending macnhine=======");

        

        vm.getVendingMachinState().pushToInsertCoin(vm);

        try {
            vm.getVendingMachinState().selectProduct(vm);
        } catch (Exception e) {
            System.out.println("This operation is not allowed "+e.getMessage());
        }
        

        vm.getVendingMachinState().insertCoin(vm, Coin.ONE);
        vm.getVendingMachinState().insertCoin(vm, Coin.TWO);
        vm.getVendingMachinState().insertCoin(vm, Coin.FIVE);

        //vm.getVendingMachinState().back(vm);

        System.out.println("========Changing the state of the vending macnhine=======");
        
        vm.getVendingMachinState().goToSelectProduct(vm);

        //vm.getVendingMachinState().back(vm);

        vm.getVendingMachinState().selectProduct(vm);

        System.out.println("========Changing the state of the vending macnhine=======");
        vm.getVendingMachinState().dispenseItem(vm);
        

    }
}
