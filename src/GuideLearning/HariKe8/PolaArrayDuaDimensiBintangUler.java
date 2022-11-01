package GuideLearning.HariKe8;

import java.util.Scanner;

public class PolaArrayDuaDimensiBintangUler {
    Scanner variabel = new Scanner(System.in);

    public int jumlahInputN() {
        System.out.print("Masukkan jumlah n: ");
        return variabel.nextInt();

    }

    public String[][] polaArray2D() {
        int n = jumlahInputN();
        String[][] arr = new String[n][n];
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                arr[baris][kolom] = "*";
            }
        }
        return arr;
    }

    public void cetakPolaArrayDuaDimensi() {
        String[][] arr = polaArray2D();
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                System.out.printf("%3s", arr[baris][kolom]);
            }
            System.out.println("");
        }
        System.out.println();
    }

    public void cetakPolaArrayDuaDimensiBintangUler() {
        String[][] arr = polaArray2D();
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                if (baris % 2 != 0) {
                    if (baris % 4 == 1) {
                        if (kolom == arr[baris].length - 1) {
                            System.out.printf("%3s", arr[baris][kolom]);
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                    if (baris % 4 == 3) {
                        if (kolom == 0) {
                            System.out.printf("%3s", arr[baris][kolom]);
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                } else {
                    System.out.printf("%3s", arr[baris][kolom]);
                }
            }
            System.out.println("");
        }
        System.out.println();

    }

    public void cetakPolaArrayDuaDimensiBintangUlerAngka() {
        String[][] arr = polaArray2D();
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                if (baris % 2 != 0) {
                    if (baris % 4 == 1) {
                        if (kolom == arr[baris].length - 1) {
                            System.out.printf("%3s", arr[baris][kolom]);
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                    if (baris % 4 == 3) {
                        if (kolom == 0) {
                            System.out.printf("%3s", arr[baris][kolom]);
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                } else {
                    if (baris % 4 == 0) {
                        System.out.printf("%3s", kolom * 2);
                    }
                    if (baris % 4 == 2) {
                        System.out.printf("%3s", kolom * 2 + 1);
                    }
                }
            }
            System.out.println("");
        }
        System.out.println();

    }

    public void cetakPolaArrayDuaDimensiBintangUlerAngkaBerurut() {
        String[][] arr = polaArray2D();
        int nilaiBantuGanjil1 = arr.length + 1;
        int nilaiBantuGanjil2 = 2 * arr.length + 2;
        int nilaiBantuGenap1 = 1;
        int nilaiBantuGenap2 = arr.length + 1;
        int awal1Genap = 0;
        int awal2Genap = 2;
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                if (baris % 2 != 0) {
                    if (baris % 4 == 1) {
                        if (kolom == arr[baris].length - 1) {
                            System.out.printf("%3d", nilaiBantuGanjil1);
                            nilaiBantuGanjil1 = nilaiBantuGanjil1 + nilaiBantuGanjil2;
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                    if (baris % 4 == 3) {
                        if (kolom == 0) {
                            System.out.printf("%3d", nilaiBantuGanjil2);
                            nilaiBantuGanjil2 = nilaiBantuGanjil2 + nilaiBantuGanjil2;
                        } else {
                            System.out.printf("%3s", "");
                        }
                    }
                }
                if (baris % 2 == 0 && baris == awal1Genap) {
                    awal1Genap = awal1Genap + 4;
                    for (int nilaiBantuGenap = nilaiBantuGenap1; nilaiBantuGenap < nilaiBantuGenap1 + arr.length; nilaiBantuGenap++) {
                        System.out.printf("%3d", nilaiBantuGenap);
                    }
                    nilaiBantuGenap1 = nilaiBantuGenap1 + 2 * arr.length + 2;
                }
                if (baris % 2 == 0 && baris == awal2Genap) {
                    awal2Genap = awal2Genap + 4;
                    for (int nilaiBantuGenap = nilaiBantuGenap2 + arr.length; nilaiBantuGenap > nilaiBantuGenap2; nilaiBantuGenap--) {
                        System.out.printf("%3d", nilaiBantuGenap);
                    }
                    nilaiBantuGenap2 = nilaiBantuGenap2 + 2 * arr.length + 2;
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        PolaArrayDuaDimensiBintangUler hasil = new PolaArrayDuaDimensiBintangUler();
        hasil.cetakPolaArrayDuaDimensi();
        hasil.cetakPolaArrayDuaDimensiBintangUler();
        hasil.cetakPolaArrayDuaDimensiBintangUlerAngka();
        hasil.cetakPolaArrayDuaDimensiBintangUlerAngkaBerurut();
    }
}
