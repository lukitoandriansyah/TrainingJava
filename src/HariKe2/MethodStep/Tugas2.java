package HariKe2.MethodStep;

import MalamMingguKuy.BuatList2;
import MalamMingguKuy.TrialFPB;
import MalamMingguKuy.TrialKPK;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Tugas2 {
    Scanner variabel = new Scanner(System.in);
    //String nama;
    int jumlahHuruf;
    int jumlahHurufVokal;
    int counter;
    int jumlahKata;

    public String inputNama() {
        System.out.print("Masukkan nama anda: ");
        String nama = variabel.nextLine();
        return nama;
    }

    public void cariJumlahHuruf() {
        String[] arrayHuruf = inputNama().split("");
        jumlahHuruf = 0;
        for (int batas = 0; batas < arrayHuruf.length; batas++) {
            if (!(arrayHuruf[batas].equalsIgnoreCase(" "))) {
                jumlahHuruf = jumlahHuruf + 1;
            }
        }
        System.out.print(jumlahHuruf);
    }

    public void cariJumlahHurufVokal() {
        String[] arrayHuruf = inputNama().split("");
        jumlahHurufVokal = 0;
        for (int batas = 0; batas < arrayHuruf.length; batas++) {
            if (arrayHuruf[batas].equalsIgnoreCase("a") ||
                    arrayHuruf[batas].equalsIgnoreCase("i") ||
                    arrayHuruf[batas].equalsIgnoreCase("u") ||
                    arrayHuruf[batas].equalsIgnoreCase("e") ||
                    arrayHuruf[batas].equalsIgnoreCase("o")) {
                //arrHuruf[i] = Integer.toString(counter++);
                jumlahHurufVokal = jumlahHurufVokal + 1;
            }
        } System.out.print(jumlahHurufVokal);
    }

    public void ubahHurufVokalJadiAngka() {
        String[] arrayHuruf = inputNama().split("");
        counter = 1;
        for (int batas = 0; batas < arrayHuruf.length; batas++) {
            if (arrayHuruf[batas].equalsIgnoreCase("a") ||
                    arrayHuruf[batas].equalsIgnoreCase("i") ||
                    arrayHuruf[batas].equalsIgnoreCase("u") ||
                    arrayHuruf[batas].equalsIgnoreCase("e") ||
                    arrayHuruf[batas].equalsIgnoreCase("o")) {
                //arrHuruf[i] = Integer.toString(counter++);
                arrayHuruf[batas] = String.valueOf(counter);
            }
            counter = counter + 1;
        }
        for (int batas = 0; batas < arrayHuruf.length; batas++) {
            System.out.print(arrayHuruf[batas]);
        }
    }

    public void menghitungJumlahKata() {
        String[] arrayKata = inputNama().split(" ");
        jumlahKata = 0;
        for (int batas = 0; batas < arrayKata.length; batas++) {
            if (arrayKata[batas].equalsIgnoreCase("") ||
                    arrayKata[batas].equalsIgnoreCase(" ")) {
                jumlahKata = jumlahKata + 1;
            }
        }
        System.out.print(jumlahKata);
    }

    public void kondisi() {
        System.out.print("Apakah anda ingin mengulang pilihan? [Y/N] ");
        String keputusan = variabel.next();
        if (Objects.equals(keputusan, "Y")) {
            pilihan();
        } else if (Objects.equals(keputusan, "N")) {
            System.out.print("Terima kasih sudah menggunakan menu kami☺️");
            System.exit(0);
        } else {
            System.out.println("Pilihan tidak ada, pilih dengan benar!!!");
            kondisi();
        }
    }

    public void pilihan() {
        System.out.print("Masukkan pilihan Anda!!! ");
        int nomorPilihan = variabel.nextInt();
        //do
        //{
        switch (nomorPilihan) {
            case 1:
                System.out.print("Jumlah suku kata adalah: ");
                menghitungJumlahKata();
                kondisi();
                break;
            case 2:
                System.out.print("Jumlah huruf vokal: ");
                cariJumlahHurufVokal();
                kondisi();
                break;
            case 3:
                System.out.print("Ubah huruf vokal menjadi angka berurut: ");
                ubahHurufVokalJadiAngka();
                kondisi();
                break;
            case 4:
                System.out.print("Jumlah huruf: ");
                cariJumlahHuruf();
                kondisi();
            case 5:
                System.out.print("Terima kasih sudah menggunakan menu kami☺️");
                System.exit(0);
                break;
            default:
                System.out.println("Error!!! \n pilih menu 1-5");
                pilihan();
                break;
        }
        //}
        //while (nomorPilihan > 0 && nomorPilihan != 4 );
    }

    public static void main(String[] args) {
        Tugas2 hasil = new Tugas2();
        hasil.pilihan();

    }
}
