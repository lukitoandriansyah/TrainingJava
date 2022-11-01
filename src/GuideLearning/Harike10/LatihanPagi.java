package GuideLearning.Harike10;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanPagi {

    //User Perlu memasukkan input N
    //Method imput N

    public int jumlahInputUser(){
        System.out.print("Silahkan masukkan jumlah nilai: ");
        Scanner variabel = new Scanner(System.in);
        int n = variabel.nextInt();
        System.out.println("Masukkkan nilai sebanyak jumlah nilai yang anda masukan");
        return n;
    }

    //Tentu nilainya nanti akan ditampung dalam suatu array
    //Methode buat wadah input user
    public int[] wadahInput(){
        int n = jumlahInputUser();
        int[] wadah = new int[n];
        isiWadahInput(wadah);
        return wadah;
    //public int inputUser(int n){
    //    for(int input)
    }

    public void isiWadahInput(int[]wadah){
        Scanner variabel = new Scanner(System.in);
        for(int inputKe = 0; inputKe<wadah.length; inputKe++){
            wadah[inputKe] = variabel.nextInt();
        }
        System.out.println("INFORMASI!!!");
        System.out.println("Di bawah ini adalah nilai yang anda berikan");
    }

    //Methode menjalankan wadah input
    public void cetakWadahInput(){
        int[] wadah = wadahInput();
        Arrays.sort(wadah);
        for(int ke = 0; ke<wadah.length; ke++){
            System.out.printf("%3d", wadah[ke]);
        }
    }

    //Method hitung FPB
    public void hitungFPB(int[] wadah){
        int[] inputHitungFPB = new int[wadah.length];


    }


    public static void main(String[] args) {
        LatihanPagi hasil = new LatihanPagi();
        hasil.cetakWadahInput();

    }
}
