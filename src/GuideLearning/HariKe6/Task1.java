package GuideLearning.HariKe6;

import java.util.*;

public class Task1 {
    Scanner variabel = new Scanner(System.in);

    public int banyakInputN() {
        System.out.println("Cetak banyak InputN: ");
        int N = variabel.nextInt();
        int parameter = N;
        return parameter;
    }

    public void arrayTask1() {
        int n = banyakInputN();
        int newIndex;
        int[] arrI = new int[n];
        int[] arrI2 = new int[n];
        System.out.println("Urutan input: ");
        for (int inputKe = 0; inputKe < n; inputKe++) {
            arrI[inputKe] = variabel.nextInt();
        }
        for (int inputKe = 0; inputKe < n; inputKe++) {
            newIndex = 0;
            for (int keInput = 0; keInput < n; keInput++) {
                if (arrI[inputKe] > arrI[keInput]) {
                    newIndex++;
                }
            }
            arrI2[newIndex] = arrI[inputKe];
        }
        System.out.println("Cetak berurut Ascending: ");
        for (newIndex = 0; newIndex < n; newIndex++) {
            System.out.print(arrI2[newIndex]+ " ");
        }
        System.out.println();
        System.out.println("Cetak berurut Descending: ");
        for (newIndex = n - 1; newIndex > -1; newIndex--) {
            System.out.print(arrI2[newIndex]+ " ");
        }
        System.out.println();
    }
        public static void main (String[]args){
            Task1 hasil = new Task1();
            hasil.arrayTask1();

    }

}
