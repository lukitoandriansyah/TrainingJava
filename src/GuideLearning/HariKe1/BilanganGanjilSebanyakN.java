package GuideLearning.HariKe1;

import java.util.Scanner;

public class BilanganGanjilSebanyakN {

    Scanner variabel = new Scanner(System.in);

    public int jumlahInput() {
        System.out.print("Jumlah bilangan yang ingin dicari: ");
        int n = variabel.nextInt();
        variabel.close();
        //cetakGanjil(n);
        return n;
    }

    public void cetakGanjil() {
        int n = jumlahInput();
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 1);
        }
    }

    public static void main(String[] args) {
        BilanganGanjilSebanyakN hasil = new BilanganGanjilSebanyakN();
        hasil.cetakGanjil();
    }
}
