package vandingmachine.repository;

public interface VendingMachine {
    public void serveBuy(String input);
    public void serveCashBack(String input);
    public void detectStock(String input);
}
