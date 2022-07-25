package Harike10;

import java.util.*;

public class Pemanasan1 {

    //Ambil inputan N
    public int banyakInputN() {
        System.out.print("Masukkan inputan N: ");
        Scanner variabel = new Scanner(System.in);
        int n = variabel.nextInt();
        variabel.close();
        return n;
    }

    //Kerangka Array

    public String[][] kerangkaArray() {
        int n = banyakInputN();
        String[][] array = new String[n][n];
        isiKerangkaArray(array);
        return array;
    }

    //Method untuk mengisi kerangkaArray

    public void isiKerangkaArray(String[][] array) {
        for (int baris = 0; baris < array.length; baris++) {
            for (int kolom = 0; kolom < array.length; kolom++) {
                //array[baris][kolom] = "*";
                if(baris<=kolom && baris <= array.length/2){
                    array[baris][kolom]= String.valueOf(kolom);
                }else if(baris+kolom>=array.length-1 && baris >= array.length/2){
                    array[baris][kolom]= String.valueOf(kolom);
                }else{
                    array[baris][kolom]=" ";
                }
            }
        }

    }

    //Method untuk mencetak kerangkaArray

    public void cetakKerangkaArray() {
        String[][] arrays = kerangkaArray();
        for (int baris = 0; baris < arrays.length; baris++) {
            for (int kolom = 0; kolom < arrays.length; kolom++) {
                System.out.printf("%3s", arrays[baris][kolom]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pemanasan1 hasil = new Pemanasan1();
        hasil.cetakKerangkaArray();
    }
}
