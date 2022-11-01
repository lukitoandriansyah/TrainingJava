package GuideLearning.HariKe5;
import java.util.*;

public class Task5Revisi {
    public int ambilN(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = variabel.nextInt();
        return n;
    }

    public void kerangkaFrame(){
        int batas = ambilN();
        for (int i = 0; i<batas; i++){
            for (int j =0 ; j<batas; j++){
                if (i % 2 ==0){
                    System.out.printf("%3s", "*");
                }else if (i %2 != 0){
                    if(i % 4 == 1 && j == batas-1){
                        System.out.printf("%3s","*");
                    }else if(i % 4 ==3 && j == 0){
                        System.out.printf("%3s","*");
                    }else{
                        System.out.printf("%3s", " ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Task5Revisi frame = new Task5Revisi();
        frame.kerangkaFrame();

    }

}
