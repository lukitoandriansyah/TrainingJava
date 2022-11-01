package GuideLearning.HariKe3;

import java.util.Scanner;

public class Part4TemplateOpsi {
    void template() {
        Scanner variabel = new Scanner(System.in);
        System.out.println("Masukkan Kalimat yang anda inginkan: ");
        String nama = variabel.nextLine();
        Part3SwitchCaseMethods hasil2 = new Part3SwitchCaseMethods();
        System.out.print("Berikut adalah opsi menu yang bisa anda gunakan:  \n" +
                "1. Tampilkan Jumlah Huruf Kalimat ! \n" +
                "2. Tampilkan Jumlah Huruf Vokal Kalimat ! \n" +
                "3. Tampilan Jumlah Kata Dalam Kalimat ! \n" +
                "4. Tampilkan kembali kalimat tetapi semua huruf vokal diganti " +
                "oleh angka berurut ! \n" +
                "5. Tampilkan semua info ! \n");
        System.out.println("Masukkan Angka dari pilihan yang tersedia: ");
        String opsi = variabel.next();
        hasil2.switchCase(nama, opsi);
    }

}
