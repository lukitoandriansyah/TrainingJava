package HariKe4;

import java.util.Scanner;

public class Tugas4 {
    public int n;
    public int suku1 = 0;
    public char alphabet = 'A';
    Scanner variabel = new Scanner(System.in);

    public void bilanganAbjad() {
        System.out.print("Masukkan Batas: ");
        this.n = variabel.nextInt();
        for (int i = 0; i < this.n; i++) {
            if (i%2==0){
                this.suku1+=1;
                System.out.print(this.suku1);

            }else {;
                this.alphabet = ++this.alphabet;
                System.out.print(this.alphabet);
            }
        }
    }
    public static void main(String[] args) {
        Tugas4 hasil2 = new Tugas4();
        hasil2.bilanganAbjad();
    }
}
