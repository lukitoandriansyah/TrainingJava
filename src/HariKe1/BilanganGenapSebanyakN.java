package HariKe1;
import java.util.Scanner;

public class BilanganGenapSebanyakN {

    Scanner variabel = new Scanner(System.in);

    public int jumlahInput() {
        System.out.print("Jumlah bilangan yang ingin dicari: ");
        int n = variabel.nextInt();
        variabel.close();
        //cetakGanjil(n);
        return n;
    }

    public void cetakGenap() {
        int n = jumlahInput();
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2);
        }
    }

    public static void main(String[] args) {
        BilanganGenapSebanyakN hasil = new BilanganGenapSebanyakN();
        hasil.cetakGenap();
    }
}
