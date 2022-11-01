package GuideLearning.HariKe7;

import java.util.Scanner;

public class Task1 {
    Scanner variabel = new Scanner(System.in);
    public int banyakInputN(){
        System.out.print("Masukkan jumlah input N: ");
        int n = variabel.nextInt();
        return n;

    }

    public String[][] isiPolaArray2Dimensi(){
        int n = banyakInputN();
        String[][] arr = new String[n][n];
        for (int i =0; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                arr[i][j]="*";
            }
        }return arr;
    }

    public void cetakPolaArray(){
        String[][] polaArray = isiPolaArray2Dimensi();
        for (int i = 0 ; i< polaArray.length; i++){
            for(int j = 0 ; j< polaArray[i].length; j++){
                System.out.printf("%3s", polaArray[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task1 hasil = new Task1();
        hasil.cetakPolaArray();
    }
}
