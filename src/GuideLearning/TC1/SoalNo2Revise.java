package GuideLearning.TC1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoalNo2Revise {
    Scanner variabel = new Scanner(System.in);

    public int jumlahUang() {

        System.out.print("Jumlah uang Andi adalah: ");
        int n = variabel.nextInt();
        return n;
    }

    public int[] kerangkaBaju() {
        int input = 3;
        int[] baju = new int[input];
        isiKerangkaBaju(baju);
        return baju;
    }

    public void isiKerangkaBaju(int[] baju) {
        for (int batas = 0; batas < baju.length; batas++) {
            baju[batas] = variabel.nextInt();
        }
    }

    public int[] kerangkaKacaMata() {
        int input = 3;
        int[] kacaMata = new int[input];
        isiKerangkaKacaMata(kacaMata);
        return kacaMata;
    }

    public void isiKerangkaKacaMata(int[] kacaMata) {
        for (int batas = 0; batas < kacaMata.length; batas++) {
            kacaMata[batas] = variabel.nextInt();
        }
    }

    public void cetakHasil() {
        int n = jumlahUang();
        int[] baju = kerangkaBaju();
        System.out.print("Harga Baju: ");
        for (int batas = 0; batas < baju.length; batas++) {
            System.out.printf("%3d", baju[batas]);
        }
        System.out.println();

        int[] kacaMata = kerangkaKacaMata();
        System.out.print("Harga KacaMata: ");
        for (int batas = 0; batas < kacaMata.length; batas++) {
            System.out.printf("%3s", kacaMata[batas]);
        }
        System.out.println();

        ArrayList hasil = new ArrayList();
        ArrayList lastHasil = new ArrayList();
        int hasilMax = 0;
        if (baju[0] > n || baju[1] > n || baju[2] > n || kacaMata[0] > n || kacaMata[1] > n || kacaMata[2] > n) {
            System.out.print("Dana Tidak Mencukupi");

        } else {
            for (int batasBaju = 0; batasBaju < baju.length; batasBaju++) {
                for (int batasKacaMata = 0; batasKacaMata < kacaMata.length; batasKacaMata++) {
                    hasil.add(baju[batasBaju] + kacaMata[batasKacaMata]);
                    //System.out.printf("%3d", hasil.get());
                }
            }
            Collections.sort(hasil);
            System.out.print("Hasil: ");
            for (int batas = 0; batas < hasil.size(); batas++) {
                if ((int) hasil.get(batas) <= n) {
                    lastHasil.add(hasil.get(batas));
                }
            }
            for (int batas = 0; batas < lastHasil.size(); batas++) {
                System.out.printf("%3d", lastHasil.get(lastHasil.size() - 1));
                System.out.println();
                hasilMax = hasilMax + (int) lastHasil.get(lastHasil.size() - 1);
                break;
            }

            for (int batasBaju = 0; batasBaju < baju.length; batasBaju++) {
                for (int batasKacaMata = 0; batasKacaMata < kacaMata.length; batasKacaMata++) {
                    if (baju[batasBaju] + kacaMata[batasKacaMata] == hasilMax) {
                        System.out.println("Harga Baju: " + baju[batasBaju]);
                        System.out.println("Harga kacaMata: " + kacaMata[batasKacaMata]);
                    }
                    //System.out.printf("%3d", hasil.get());
                }
            }

        }

    }

    public static void main(String[] args) {
        SoalNo2Revise hasil = new SoalNo2Revise();
        hasil.cetakHasil();

    }
}
