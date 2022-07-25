package HariKe4;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan bilangan ganjil: ");
        int n = variabel.nextInt();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.print("ERROR!!! Masukkan bilangan ganjil!! ");
        }
    }
}