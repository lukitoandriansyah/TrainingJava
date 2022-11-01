package GuideLearning.HariKe6;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    Scanner variabel = new Scanner(System.in);
    char ch = 'A';

    public int banyakInputN() {
        System.out.println("Cetak banyak InputN: ");
        int N = variabel.nextInt();
        int parameter = N;
        return parameter;
    }

    public int[] kerangkaArray() {
        int n = banyakInputN();
        int[] arrI = new int[n];
        return arrI;
    }

    public String[] kerangkaArray2() {
        int n = banyakInputN();
        String[] arrII = new String[n];
        return arrII;
    }

    public void bilanganGanjil() {
        int[] arr = kerangkaArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 1;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void bilanganGenap() {
        int[] arr = kerangkaArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 2;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void bilanganFibonaci() {
        int[] arr = kerangkaArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            if(i==0){
                arr[i]=1;
            }if(i==1){
                arr[i]=1;
            }if(i>1 && i< arr.length){
                arr[i]=arr[i-2]+arr[i-1];
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void bilanganTribonaci() {
        int[] arr = kerangkaArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            if(i==0){
                arr[i]=1;
            }if(i==1){
                arr[i]=1;
            }if(i==2){
                arr[i]=1;
            }if(i>2 && i< arr.length){
                arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
            }

        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void hurufSepanjangN() {
        String[] arr = kerangkaArray2();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i]= String.valueOf(this.ch);
            this.ch++;

        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        Task2 hasil = new Task2();
        hasil.bilanganGanjil();
        hasil.bilanganGenap();
        hasil.bilanganFibonaci();
        hasil.bilanganTribonaci();
        hasil.hurufSepanjangN();

    }
}
