package GuideLearning.HariKe6;

import java.util.*;

public class Task3 {
    Scanner variabel = new Scanner(System.in);
    int nilai = 0;
    char ch = 'A';
    char ch2 = 'A';
    char ch3 = 'A';
    char ch4 = 'A';

    public int banyakN() {
        System.out.print("Masukkan jumlah input n: ");
        return variabel.nextInt();
    }

    public int[] kerangkaArray() {
        int n = banyakN();
        return new int[n];
    }

    public String[] kerangkaArray2() {
        int n = banyakN();
        return new String[n];
    }

    public void derertUmum() {
        int[] arr = kerangkaArray();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = i + 1;
            }
            for (int j = arr.length / 2; j < arr.length; j++) {
                arr[j] = j - (2 * this.nilai);
                this.nilai++;
            }
        } else {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                arr[i] = i + 1;
            }
            for (int j = (arr.length + 1) / 2; j < arr.length; j++) {
                arr[j] = j - (2 * this.nilai + 1);
                this.nilai++;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void fibonacci() {
        int[] arr = kerangkaArray();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (i == 0) {
                    arr[i] = 1;
                }
                if (i == 1) {
                    arr[i] = 1;
                }
                if (i > 1 && i < arr.length / 2) {
                    arr[i] = arr[i - 2] + arr[i - 1];
                }
            }
            for (int j = arr.length / 2; j < arr.length; j++) {
                if (j == arr.length / 2) {
                    arr[arr.length / 2] = arr[arr.length / 2 - 1];
                }
                if (j == arr.length / 2 + 1) {
                    arr[arr.length / 2 + 1] = arr[arr.length / 2 - 2];
                }
                if (j > arr.length / 2 + 1) {
                    arr[j] = arr[j - 2] - arr[j - 1];
                }
            }
        } else {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                if (i == 0) {
                    arr[i] = 1;
                }
                if (i == 1) {
                    arr[i] = 1;
                }
                if (i > 1 && i < (arr.length + 1) / 2) {
                    arr[i] = arr[i - 2] + arr[i - 1];
                }
            }
            for (int j = (arr.length + 1) / 2; j <= arr.length - 1; j++) {
                if (j == (arr.length + 1) / 2) {
                    arr[(arr.length + 1) / 2] = arr[(arr.length + 1) / 2 - 1] - arr[(arr.length + 1) / 2 - 3];
                }
                if (j == (arr.length + 1) / 2 + 1) {
                    arr[(arr.length + 1) / 2 + 1] = arr[(arr.length + 1) / 2 - 1] - arr[(arr.length + 1) / 2];
                }
                if (j > (arr.length + 1) / 2 + 1 && j <= arr.length - 1) {
                    arr[j] = arr[j - 2] - arr[j - 1];
                }
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void deretVariabel() {
        String[] arr = kerangkaArray2();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = String.valueOf(this.ch);
                this.ch++;
            }
            for (int j = arr.length - 1; j >= arr.length / 2; j--) {
                arr[j] = String.valueOf(this.ch2);
                this.ch2++;
            }
        } else {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                arr[i] = String.valueOf(this.ch);
                this.ch++;
            }
            for (int j = arr.length - 1; j >= (arr.length + 1) / 2; j--) {
                arr[j] = String.valueOf(this.ch2);
                this.ch2++;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public void deretAngkaVariabel() {
        String[] arr = kerangkaArray2();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (i % 2 != 0) {
                    arr[i] = String.valueOf((i + 1) / 2);
                }
                if (i % 2 == 0) {
                    arr[i] = String.valueOf(this.ch3);
                    this.ch3++;
                }
            }
            for (int j = arr.length - 1; j >= arr.length / 2; j--) {
                if (j % 2 != 0) {
                    arr[j] = String.valueOf(this.ch4);
                    this.ch4++;
                }
                if (j % 2 == 0) {
                    arr[j] = String.valueOf((arr.length - j) / 2);
                }
            }
        } else {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                if (i % 2 != 0) {
                    arr[i] = String.valueOf((i + 1) / 2);
                }
                if (i % 2 == 0) {
                    arr[i] = String.valueOf(this.ch3);
                    this.ch3++;
                }
            }
            for (int j = arr.length - 1; j >= (arr.length + 1) / 2; j--) {
                if (j % 2 != 0) {
                    arr[j] = String.valueOf((arr.length - j) / 2);
                }
                if (j % 2 == 0) {
                    arr[j] = String.valueOf(this.ch4);
                    this.ch4++;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }


    public static void main(String[] args) {
        Task3 hasil = new Task3();
        hasil.derertUmum();
        hasil.fibonacci();
        hasil.deretVariabel();
        hasil.deretAngkaVariabel();

    }
}
