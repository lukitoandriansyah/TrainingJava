package HariKe4;

import java.util.Scanner;

public class Tugas7Pengembangan2 {
    public static void main(String[] args) {
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan batas Iterasi: ");
        int n = variabel.nextInt();
        int awal1Ganjil = 1;
        int awal2Ganjil = 3;
        int m = 1;
        int o = n+1;
        int p = n+1;
        int q = 2*n+2;
        int awal1Genap = 0;
        int awal2Genap = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0 && i == awal1Genap) {
                    awal1Genap = awal1Genap + 4;
                    for (int k = m; k < m + n; k++) {
                        System.out.printf("%3d", k);
                    }
                    m = m + (2 * n + 2);
                } else if (i % 2 == 0 && i == awal2Genap) {
                    awal2Genap = awal2Genap + 4;
                    for (int l = n + o; l > o; l--) {
                        System.out.printf("%3d", l);
                    }
                    o = o + (2 * n + 2);
                } else if (i % 2 != 0 && i == awal1Ganjil && j == n - 1) {
                    awal1Ganjil = awal1Ganjil + 4;
                    System.out.printf("%3d", p);
                    p = p + (2 * n + 2);
                } else if (i % 2 != 0 && i == awal2Ganjil && j == 0) {
                    awal2Ganjil = awal2Ganjil + 4;
                    System.out.printf("%3d", q);
                    q = q + (2 * n + 2);
                } else {
                    System.out.printf("%3s", " ");
                }
            }
            System.out.println();
        }

    }
}
