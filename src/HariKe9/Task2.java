package HariKe9;

import java.util.Scanner;

public class Task2 {
    Scanner variabel = new Scanner(System.in);

    public int banyakInputN(){
        System.out.print("Masukkan nila n: ");
        int n = variabel.nextInt();
        variabel.close();
        return n;

    }

    public int[] fibo(){
        int n = banyakInputN();
        int[] deret = new int[n];
        deret[0]=1;
        deret[1]=1;
        for (int i = 2 ; i<n; i++){
            deret[i]=deret[i-1]+deret[i-2];
        }
        return deret;
    }

    public int[][] polaArray2D() {
        int n = banyakInputN();
        int[] arrF = fibo();
        int[][] arr = new int[n][n];
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
                arr[baris][kolom] = arrF[baris];
            }
        }
        return arr;
    }

    public void cetakPolaArrayDuaDimensi() {
        int[][] arr = polaArray2D();
        for (int baris = 0; baris < arr.length; baris++) {
            for (int kolom = 0; kolom < arr[baris].length; kolom++) {
             //   System.out.printf("%3s", arr[baris][kolom]);
             //   if (baris %2 == 0){
             //   if (kolom ==0 || kolom == arr[baris].length-1){
             //       System.out.printf("%3s", arr[0][kolom]);
             //   }else{
             //       if(baris>0 && baris<arr[baris].length-1){
             //           System.out.printf("%3s", " ");
             //       }else{
             //           System.out.printf("%3s", arr[0][kolom]);
             //       }
             //   }
                if (baris==kolom && baris%2==0){
                    System.out.printf(" *");
                }
                //segitiga ketas
                else if (baris<arr.length/2 && baris+kolom<=arr.length-1 && baris<kolom && baris%2==0){
                    System.out.printf(" *");
                }

                //segitiga kebawah
                else if (baris>arr.length/2 && baris+kolom>=arr.length && baris>kolom
                        && baris%2==0){
                    System.out.printf(" *");
                }

                //segitiga kiri
                else if (baris + kolom < arr.length && baris > kolom && kolom%2==0){
                    System.out.printf(" *");
                }

                else if ((kolom >= arr.length - baris && baris < kolom && kolom%2==0)) {
                    System.out.printf(" *");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void polaDeret(){
        int n = banyakInputN();
        int[] arrfFibo = fibo();
        int[][] arr= new int[n][n];
        for (int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]= Integer.parseInt("*");
                System.out.printf("%3s", arr[i][j]);
            }System.out.println("");
        }System.out.println();
    }

    public static void main(String[] args) {
        Task2 hasil = new Task2();
        hasil.fibo();
    }
}
