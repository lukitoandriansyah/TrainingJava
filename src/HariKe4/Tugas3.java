package HariKe4;

import java.util.Scanner;

public class Tugas3 {
    public int n;
    public int suku1 = 0;
    public int suku2 = 0;
    Scanner variabel = new Scanner(System.in);

    public void bilangan() {
        System.out.print("Masukkan Batas: ");
        this.n = variabel.nextInt();
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                this.suku1+=2;
                System.out.printf("%3d", this.suku1);

            }else {
                this.suku2+=3;
                System.out.printf("%3d", this.suku2);
            }
        }
    }

    public static void main(String[] args) {
        Tugas3 hasil = new Tugas3();
        hasil.bilangan();
    }
}
