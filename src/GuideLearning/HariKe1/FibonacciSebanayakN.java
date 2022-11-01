package GuideLearning.HariKe1;

import java.util.Scanner;

public class FibonacciSebanayakN {

    Scanner variabel = new Scanner(System.in);

    public int jumlahInput() {
        System.out.print("Jumlah bilangan yang ingin dicari: ");
        int n = variabel.nextInt();
        variabel.close();
        //cetakGanjil(n);
        return n;
    }

    public int[] kerangkaFibo() {
        int n = jumlahInput();
        int[] fibo = new int[n];
        isiKerangkaFibo(fibo);
        return fibo;
    }

    public void isiKerangkaFibo(int[] fibo) {
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public void cetakFibo() {
        int[] fibo = kerangkaFibo();
        for (int i : fibo) {
            System.out.printf("%3s", i);
        }
    }

    public static void main(String[] args) {
        FibonacciSebanayakN hasil = new FibonacciSebanayakN();
        hasil.cetakFibo();
    }
}

