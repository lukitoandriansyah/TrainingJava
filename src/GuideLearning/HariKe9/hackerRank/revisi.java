package GuideLearning.HariKe9.hackerRank;

import java.util.Scanner;

public class revisi {
    public int getN(){
        System.out.print("Masukan Jangkauan N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        return n;
    }

    public int[] polaFibo(int n){
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i<n; i++){
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }
        return arrFibo;
    }

    public void polaPertama(int n){
        int[] x = polaFibo(n);
        int m = n/2;
        int y=0;
        int tampunganFibo;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                //Silang
                if (i+j==n-1 && i%2==0 && i<m){
                    tampunganFibo = x[y];
                    y=y+1;
                    System.out.print(tampunganFibo);
//                    System.out.printf(" *");
                }else if (i==j && i%2==0){
                    System.out.printf(" *");
                }
                //segitiga ketas
                else if (i<m && i+j<=n-1 && i<j && i%2==0){
                    System.out.printf(" *");
                }

                //segitiga kebawah
                else if (i>m && i+j>=n && i>j && i%2==0){
                    System.out.printf(" *");
                }

                //segitiga kiri
                else if (i + j < n && i > j && j%2==0){
                    System.out.printf(" *");
                }

                else if ((j >= n - i && i < j && j%2==0)) {
                    System.out.printf(" *");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void pilihanUtama(){
        int n = getN();
        polaPertama(n);
    }

    public static void main(String[] args) {
        revisi cetak = new revisi();
        cetak.pilihanUtama();
    }
}
