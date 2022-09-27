package vandingmachine;

public class ModelVandingMachineMenu extends ModelVandingMachineMainInteract {
    public static void showMenu() {
        ModelVandingMachineMainInteract test = new ModelVandingMachineMainInteract();
        test.moneyList();
        test.priceList();
        System.out.println(" ");
        System.out.println("==============================");
        System.out.print("Masukkan uang anda: ");
        test.inputMoneyCheck();
    }
}
