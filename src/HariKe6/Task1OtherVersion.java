package HariKe6;

import java.util.Arrays;
import java.util.Scanner;

public class Task1OtherVersion {
    Scanner variabel = new Scanner(System.in);

    public int banyakInputN() {
        System.out.println("Cetak banyak InputN: ");
        int N = variabel.nextInt();
        int parameter = N;
        return parameter;
    }

    public int[] kerangkaArray() {
        int n = banyakInputN();
        int[] arrI = new int[n];
        System.out.println("Urutan input: ");
        for (int inputKe = 0; inputKe < arrI.length; inputKe++) {
            arrI[inputKe] = variabel.nextInt();
        }
        return arrI;
    }

    public void arrayTask1Sortir() {
        int[] arrDesc = kerangkaArray();
        for (int inputKe = 0; inputKe < arrDesc.length; inputKe++) {
            for (int input = 0; input < arrDesc.length; input++) {
                if (arrDesc[input] > arrDesc[inputKe]) {
                    int outputLoop = arrDesc[input];
                    arrDesc[input] = arrDesc[inputKe];
                    arrDesc[inputKe] = outputLoop;
                }
            }
        }
        System.out.println(Arrays.toString(arrDesc));

        for (int inputKe = 0; inputKe < arrDesc.length; inputKe++) {
            for (int input = 0; input < arrDesc.length; input++) {
                if (arrDesc[input] < arrDesc[inputKe]) {
                    int outputLoop = arrDesc[input];
                    arrDesc[input] = arrDesc[inputKe];
                    arrDesc[inputKe] = outputLoop;
                }
            }
        }
        String arrAsc=Arrays.toString(arrDesc);
        System.out.println(arrAsc);
    }

    public static void main(String[] args) {
        Task1OtherVersion hasil = new Task1OtherVersion();
        hasil.arrayTask1Sortir();

    }

}
