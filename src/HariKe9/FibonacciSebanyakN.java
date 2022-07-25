package HariKe9;
import java.util.Scanner;

public class FibonacciSebanyakN {
    public static void main(String[] args){
        Scanner variabel = new Scanner(System.in);
        System.out.println("Batas Bilangan yang ingin ditampilkan: ");
        int batas = Integer.parseInt(variabel.nextLine());
        System.out.println("Suku pertama yang diinginkan: ");
        int a= Integer.parseInt(variabel.nextLine());
        System.out.println("Suku kedua yang diinginkan: ");
        int b= Integer.parseInt(variabel.nextLine());

        if (a>b){
            System.out.println("Error!!! Jalankan ulang program dan Masukkan nilai " +
                    "suku kedua yang lebih besar dari " +
                    "suku pertama! ");
        }
        else{
            int JumlahSuku = 1;
            System.out.println("Output:");
            System.out.println(a);
            System.out.println(b);
            while (a<=b & JumlahSuku<=(batas-2)){
                int c = a+b;
                System.out.println(c);
                a+=(b-a);
                b+=(c-b);
                JumlahSuku ++;
            }
        }
    }
}
