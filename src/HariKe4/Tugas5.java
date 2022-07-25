package HariKe4;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan batas Iterasi: ");
        int n = variabel.nextInt();
        int awal1 = 1;
        int awal2 = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else if(i %2 != 0 && i==awal1 && j==n-1){
                    awal1= awal1+4;
                    System.out.print("*");
                } else if(i %2 != 0 && i==awal2 && j==0){
                    awal2= awal2+4;
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}

