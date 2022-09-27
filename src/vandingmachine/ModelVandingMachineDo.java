package vandingmachine;

import vandingmachine.repository.VandingMachinesFitur;

public class ModelVandingMachineDo implements VandingMachinesFitur {
    static String[] stockList = stock.split(" ");
    static String[] snackList = snacks.split(" ");
    static String[] priceList = prices.split(" ");
    static String[] moneyMayList = moneyMay.split(" ");
    static boolean isRunning = true;
    static int savedInput = 0;


    @Override
    public void serveBuy(String input) {
        System.out.print("Anda Membeli: " + input);
    }

    @Override
    public void serveCashBack(String input) {
        System.out.print("Kembalian Anda: " + input);
    }

    @Override
    public void detectStock(String input) {
        System.out.println("Stok " + input);
    }
}
