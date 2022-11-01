package GuideLearning.HariKe9;


import java.util.Scanner;

public class Task1 {
    Scanner variabel = new Scanner(System.in);

    public int banyakInputN(){
        System.out.print("Masukkan nilai n: ");
        int n = variabel.nextInt();
        variabel.close();
        return n;
    }

    public int[] fibonacci(int n){
        int[] deret= new int[n];
        deret[0] = 1;
        deret[1] = 1;
        for (int i = 2 ; i <n; i++){
            deret[i]=deret[i-1]+deret[i-2];
        }return deret;
    }

    public void array(){
        int n = banyakInputN();
        int[] deretFibo = fibonacci(n);
        int lala;
        for ( int i = 0; i<n; i++){
            for (int j = 0 ; j<n; j++){
                if (i == j) {
                    lala = deretFibo[i];
                    System.out.printf("%3s", lala);
                } else if (i + j == n - 1) {
                    lala = deretFibo[j];
                    System.out.printf("%3s", lala);
                }else if (i < n/2 && i + j<n-1 && i<j){
                    System.out.printf("%3s", "d");
                }else if (i > n/2 && i + j>n-1 && i>j){
                    System.out.printf("%3s", "B");
                }else if (j < n/2 && i + j<n-1 && i>j){
                    System.out.printf("%3s", "A");
                }else if (j > n/2 && i + j>n-1 && i<j ){
                    System.out.printf("%3s", "C");
                }else{
                    System.out.printf("%3s", " ");
                }
            }System.out.println("");
        }System.out.println();
    }

    public static void main(String[] args) {
        Task1 hasil = new Task1();
        hasil.array();
    }
}
