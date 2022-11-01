package GuideLearning.HariKe7;

import java.util.Scanner;

public class RefrensiJawabanTask3HariKe6 {
    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        int n = s.nextInt();
        return n;
    }

    public int[] arrayPola1(int n) {
        int[] arr = new int[n];
        int m = n / 2;
//        int c = 0;
        for (int i = 0; i < n; i++) {
            // kondisi i ketika ganjil
            if (n % 2 != 0) {
                if (i <= m) {
//                    arr[i] = ++c;
                    arr[i] = i + 1;
                } else {
//                    arr[i] = c--;
                    arr[i] = arr[n - 1 - i];
                }
            } else {
                if (i < m) {
//                    arr[i] = ++c;
                    arr[i] = i + 1;
                } else {
//                    arr[i] = c--;
                    arr[i] = arr[n - 1 - i];
                }
            }
        }

        return arr;
    }


    public int[] getFibo(int n) {
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < n; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }

        return arrFibo;
    }

    public int[] getGenap(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * 2;
        }

        return arr;
    }

    public int[] arrayPola2(int n, int[] isiArr) {
        int[] arr = new int[n];
        int m = n / 2;
        for (int i = 0; i < n; i++) {
            // kondisi i ketika ganjil
            if (n % 2 != 0) {
                if (i <= m) {
                    arr[i] = isiArr[i];
                } else {
                    arr[i] = isiArr[n - 1 - i];
                }
            } else {
                if (i < m) {
                    arr[i] = isiArr[i];
                } else {
                    arr[i] = isiArr[n - 1 - i];
                }
            }
        }

        return arr;
    }

    public void cetakPola() {
        int n = getN();
        int m = n / 2;
        int panjangArrIsi = m;
        if(n % 2 == 1) {
            panjangArrIsi = m + 1;
        }
//        int[] arrFibo = getFibo(panjangFibo);
//        int[] arrPola1 = arrayPola1(n);
//        int[] arrIsi = getGenap(panjangArrIsi);
        int[] arrIsi = getFibo(panjangArrIsi);
        int[] arrPola = arrayPola2(n, arrIsi);
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", arrPola[i]);
        }

    }

    public static void main(String[] args) {
        RefrensiJawabanTask3HariKe6 soalArray = new RefrensiJawabanTask3HariKe6();
        soalArray.cetakPola();
    }

}
