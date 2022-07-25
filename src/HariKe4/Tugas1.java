package HariKe4;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukaan Batas dimensi: ");
        int n = variabel.nextInt();
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++ ){
                if(j>i && j-i == j-i){
                    System.out.print(j-i);
                }
            }
            System.out.println("");

        }
    }
}
