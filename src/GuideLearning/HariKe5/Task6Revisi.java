package GuideLearning.HariKe5;

import java.util.Scanner;

public class Task6Revisi {
    public int ambilN(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = variabel.nextInt();
        return n;
    }

    public void kerangkaFrame(){
        int batas = ambilN();
        int awal1Ganjil = 1;
        int awal2Ganjil = 3;
        int awal1Genap = 0;
        int awal2Genap = 2;
        for (int i = 0; i<batas; i++){
            for (int j = 0; j < batas; j++) {
                if (i % 2 == 0 && i==awal1Genap) {
                    awal1Genap = awal1Genap+4;
                    for (int k = 0; k < batas; k++){
                        System.out.printf("%3d", k*2);
                    }
                } else if (i % 2 == 0 && i==awal2Genap) {
                    awal2Genap = awal2Genap+4;
                    for (int k = 0; k < batas; k++){
                        System.out.printf("%3d",k*2+1);
                    }
                } else if(i %2 != 0 && i==awal1Ganjil && j==batas-1){
                    awal1Ganjil= awal1Ganjil+4;
                    System.out.printf("%3s","*");
                } else if(i %2 != 0 && i==awal2Ganjil && j==0){
                    awal2Ganjil= awal2Ganjil+4;
                    System.out.printf("%3s","*");
                } else {
                    System.out.printf("%3s"," ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Task6Revisi frame = new Task6Revisi();
        frame.kerangkaFrame();

    }

}
